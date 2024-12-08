package com.quartz.dynamodb;

import org.quartz.*;
import org.quartz.impl.jdbcjobstore.Constants;
import org.quartz.impl.matchers.GroupMatcher;
import org.quartz.spi.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DynamoDBJobStore implements JobStore, Constants {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    @Override
    public void initialize(ClassLoadHelper classLoadHelper, SchedulerSignaler schedulerSignaler) throws SchedulerConfigException {

    }

    @Override
    public void schedulerStarted() throws SchedulerException {

    }

    @Override
    public void schedulerPaused() {

    }

    @Override
    public void schedulerResumed() {

    }

    @Override
    public void shutdown() {

    }

    @Override
    public boolean supportsPersistence() {
        return false;
    }

    @Override
    public long getEstimatedTimeToReleaseAndAcquireTrigger() {
        return 0;
    }

    @Override
    public boolean isClustered() {
        return false;
    }

    @Override
    public void storeJobAndTrigger(JobDetail jobDetail, OperableTrigger operableTrigger) throws ObjectAlreadyExistsException, JobPersistenceException {

    }

    @Override
    public void storeJob(JobDetail jobDetail, boolean b) throws ObjectAlreadyExistsException, JobPersistenceException {

    }

    @Override
    public void storeJobsAndTriggers(Map<JobDetail, Set<? extends Trigger>> map, boolean b) throws ObjectAlreadyExistsException, JobPersistenceException {

    }

    @Override
    public boolean removeJob(JobKey jobKey) throws JobPersistenceException {
        return false;
    }

    @Override
    public boolean removeJobs(List<JobKey> list) throws JobPersistenceException {
        return false;
    }

    @Override
    public JobDetail retrieveJob(JobKey jobKey) throws JobPersistenceException {
        return null;
    }

    @Override
    public void storeTrigger(OperableTrigger operableTrigger, boolean b) throws ObjectAlreadyExistsException, JobPersistenceException {

    }

    @Override
    public boolean removeTrigger(TriggerKey triggerKey) throws JobPersistenceException {
        return false;
    }

    @Override
    public boolean removeTriggers(List<TriggerKey> list) throws JobPersistenceException {
        return false;
    }

    @Override
    public boolean replaceTrigger(TriggerKey triggerKey, OperableTrigger operableTrigger) throws JobPersistenceException {
        return false;
    }

    @Override
    public OperableTrigger retrieveTrigger(TriggerKey triggerKey) throws JobPersistenceException {
        return null;
    }

    @Override
    public boolean checkExists(JobKey jobKey) throws JobPersistenceException {
        return false;
    }

    @Override
    public boolean checkExists(TriggerKey triggerKey) throws JobPersistenceException {
        return false;
    }

    @Override
    public void clearAllSchedulingData() throws JobPersistenceException {

    }

    @Override
    public void storeCalendar(String s, Calendar calendar, boolean b, boolean b1) throws ObjectAlreadyExistsException, JobPersistenceException {

    }

    @Override
    public boolean removeCalendar(String s) throws JobPersistenceException {
        return false;
    }

    @Override
    public Calendar retrieveCalendar(String s) throws JobPersistenceException {
        return null;
    }

    @Override
    public int getNumberOfJobs() throws JobPersistenceException {
        return 0;
    }

    @Override
    public int getNumberOfTriggers() throws JobPersistenceException {
        return 0;
    }

    @Override
    public int getNumberOfCalendars() throws JobPersistenceException {
        return 0;
    }

    @Override
    public Set<JobKey> getJobKeys(GroupMatcher<JobKey> groupMatcher) throws JobPersistenceException {
        return null;
    }

    @Override
    public Set<TriggerKey> getTriggerKeys(GroupMatcher<TriggerKey> groupMatcher) throws JobPersistenceException {
        return null;
    }

    @Override
    public List<String> getJobGroupNames() throws JobPersistenceException {
        return null;
    }

    @Override
    public List<String> getTriggerGroupNames() throws JobPersistenceException {
        return null;
    }

    @Override
    public List<String> getCalendarNames() throws JobPersistenceException {
        return null;
    }

    @Override
    public List<OperableTrigger> getTriggersForJob(JobKey jobKey) throws JobPersistenceException {
        return null;
    }

    @Override
    public Trigger.TriggerState getTriggerState(TriggerKey triggerKey) throws JobPersistenceException {
        return null;
    }

    @Override
    public void resetTriggerFromErrorState(TriggerKey triggerKey) throws JobPersistenceException {

    }

    @Override
    public void pauseTrigger(TriggerKey triggerKey) throws JobPersistenceException {

    }

    @Override
    public Collection<String> pauseTriggers(GroupMatcher<TriggerKey> groupMatcher) throws JobPersistenceException {
        return null;
    }

    @Override
    public void pauseJob(JobKey jobKey) throws JobPersistenceException {

    }

    @Override
    public Collection<String> pauseJobs(GroupMatcher<JobKey> groupMatcher) throws JobPersistenceException {
        return null;
    }

    @Override
    public void resumeTrigger(TriggerKey triggerKey) throws JobPersistenceException {

    }

    @Override
    public Collection<String> resumeTriggers(GroupMatcher<TriggerKey> groupMatcher) throws JobPersistenceException {
        return null;
    }

    @Override
    public Set<String> getPausedTriggerGroups() throws JobPersistenceException {
        return null;
    }

    @Override
    public void resumeJob(JobKey jobKey) throws JobPersistenceException {

    }

    @Override
    public Collection<String> resumeJobs(GroupMatcher<JobKey> groupMatcher) throws JobPersistenceException {
        return null;
    }

    @Override
    public void pauseAll() throws JobPersistenceException {

    }

    @Override
    public void resumeAll() throws JobPersistenceException {

    }

    @Override
    public List<OperableTrigger> acquireNextTriggers(long l, int i, long l1) throws JobPersistenceException {
        return null;
    }

    @Override
    public void releaseAcquiredTrigger(OperableTrigger operableTrigger) {

    }

    @Override
    public List<TriggerFiredResult> triggersFired(List<OperableTrigger> list) throws JobPersistenceException {
        return null;
    }

    @Override
    public void triggeredJobComplete(OperableTrigger operableTrigger, JobDetail jobDetail, Trigger.CompletedExecutionInstruction completedExecutionInstruction) {

    }

    @Override
    public void setInstanceId(String s) {

    }

    @Override
    public void setInstanceName(String s) {

    }

    @Override
    public void setThreadPoolSize(int i) {

    }

    @Override
    public long getAcquireRetryDelay(int i) {
        return 0;
    }
}
