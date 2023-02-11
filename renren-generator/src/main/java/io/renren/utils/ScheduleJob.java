package io.renren.utils;

import java.io.Serializable;

/**
 *
 * @author LDD
 * @version $Id: ScheduleJob.java, v 0.1 2017年10月12日 下午3:09:44 linda Exp $
 */
public class ScheduleJob implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 3472817007631613342L;

    /** JOB名称 */
    private String            jobName;
    /** JOB分组 */
    private String            jobGroup;
    /** Trigger分组 */
    private String            triggerName;
    /** Trigger分组 */
    private String            triggerGroup;
    /** 任务状态 0禁用 1启用 2删除*/
    private String            jobStatus;
    /** 任务运行时间表达式 */
    private String            cronExpression;
    /** 任务描述 */
    private String            desc;

    /**
     * Getter method for property <tt>jobName</tt>.
     *
     * @return property value of jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * Setter method for property <tt>jobName</tt>.
     *
     * @param jobName value to be assigned to property jobName
     */
    public void setJobName(final String jobName) {
        this.jobName = jobName;
    }

    /**
     * Getter method for property <tt>jobGroup</tt>.
     *
     * @return property value of jobGroup
     */
    public String getJobGroup() {
        return this.jobGroup;
    }

    /**
     * Setter method for property <tt>jobGroup</tt>.
     *
     * @param jobGroup value to be assigned to property jobGroup
     */
    public void setJobGroup(final String jobGroup) {
        this.jobGroup = jobGroup;
    }

    /**
     * Getter method for property <tt>jobStatus</tt>.
     *
     * @return property value of jobStatus
     */
    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * Setter method for property <tt>jobStatus</tt>.
     *
     * @param jobStatus value to be assigned to property jobStatus
     */
    public void setJobStatus(final String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * Getter method for property <tt>cronExpression</tt>.
     *
     * @return property value of cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * Setter method for property <tt>cronExpression</tt>.
     *
     * @param cronExpression value to be assigned to property cronExpression
     */
    public void setCronExpression(final String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * Getter method for property <tt>desc</tt>.
     *
     * @return property value of desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * Setter method for property <tt>desc</tt>.
     *
     * @param desc value to be assigned to property desc
     */
    public void setDesc(final String desc) {
        this.desc = desc;
    }

    /**
     * Getter method for property <tt>triggerName</tt>.
     *
     * @return property value of triggerName
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * Setter method for property <tt>triggerName</tt>.
     *
     * @param triggerName value to be assigned to property triggerName
     */
    public void setTriggerName(final String triggerName) {
        this.triggerName = triggerName;
    }

    /**
     * Getter method for property <tt>triggerGroup</tt>.
     *
     * @return property value of triggerGroup
     */
    public String getTriggerGroup() {
        return this.triggerGroup;
    }

    /**
     * Setter method for property <tt>triggerGroup</tt>.
     *
     * @param triggerGroup value to be assigned to property triggerGroup
     */
    public void setTriggerGroup(final String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

}
