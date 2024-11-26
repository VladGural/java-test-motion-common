package pro.gural.common.domain;

import java.time.Instant;

/**
 * @author Vladyslav Gural
 * @version 2024-11-23
 */
public class CompanyKafkaMessage {
    private KafkaActionType action;
    private Company company;
    private Instant eventTime;

    public Company getCompany() {
        return company;
    }

    public CompanyKafkaMessage setCompany(Company company) {
        this.company = company;
        return this;
    }

    public Instant getEventTime() {
        return eventTime;
    }

    public CompanyKafkaMessage setEventTime(Instant eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    public KafkaActionType getAction() {
        return action;
    }

    public CompanyKafkaMessage setAction(KafkaActionType action) {
        this.action = action;
        return this;
    }

    @Override
    public String toString() {
        return "CompanyKafkaMessage{" +
                "action=" + action +
                ", company=" + company +
                ", eventTime=" + eventTime +
                '}';
    }
}
