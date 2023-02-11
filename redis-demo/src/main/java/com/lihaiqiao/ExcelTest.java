package com.lihaiqiao;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.text.csv.CsvData;
import cn.hutool.core.text.csv.CsvReader;
import cn.hutool.core.text.csv.CsvRow;
import cn.hutool.core.text.csv.CsvUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.*;

public class ExcelTest {

    public static void main(String[] args) {
        CsvReader reader = CsvUtil.getReader();
        //从文件中读取CSV数据
        CsvData data = reader.read(FileUtil.file("C:\\Users\\Administrator\\Desktop\\order.csv"));
        List<CsvRow> rows = data.getRows();
        //遍历行
        HashSet<String> orderNoSet = new HashSet<>();
        for (CsvRow csvRow : rows) {
            //getRawList返回一个List列表，列表的每一项为CSV中的一个单元格（既逗号分隔部分）
            List<String> rawList = csvRow.getRawList();
            String orderNo = rawList.get(0).trim();
            orderNoSet.add(orderNo);
        }
        List<String> stringList = getList();
        Map<String, BigDecimal> resultMap = new HashMap<>();
        for (String orderNo : orderNoSet) {
            for (String splieStr : stringList) {
                String[] split = splieStr.split(",");
                String sys_order = split[0];
                String sys_amount = split[1];
                if (Objects.equals(orderNo, sys_order)) {
                    BigDecimal bigDecimal = new BigDecimal(sys_amount);
                    BigDecimal b1 = resultMap.get(orderNo);
                    if (Objects.isNull(b1)) {
                        resultMap.put(orderNo, bigDecimal);
                    } else {
                        BigDecimal add = bigDecimal.add(b1);
                        resultMap.put(orderNo, add);
                    }
                }
            }
        }
        for (Map.Entry<String, BigDecimal> stringBigDecimalEntry : resultMap.entrySet()) {
            String key = stringBigDecimalEntry.getKey();
            BigDecimal value = stringBigDecimalEntry.getValue();
            System.out.println(key+","+value);
        }
    }

    private static List<String> getList() {
        String adFileName = "C:\\Users\\Administrator\\Desktop\\test.txt";
        long start = System.currentTimeMillis();
        List<String> ccids = new ArrayList<>(1024);

        try {
            File file = new File(adFileName);
            if (file.exists()) {
                System.out.println(adFileName);
                FileInputStream fileInputStream = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "GBK");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String input;
                while ((input = bufferedReader.readLine()) != null) {
                    ccids.add(input);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ccids;
    }
}
