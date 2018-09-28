/*
 * This file is generated by jOOQ.
*/
package ai.eloquent.sql.common.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Timing implements Serializable {

    private static final long serialVersionUID = -1161536703;

    private final Long          id;
    private final String        key;
    private final String        host;
    private final LocalDateTime beginTime;
    private final LocalDateTime endTime;
    private final Long          total;
    private final Double        mean;
    private final Double        variance;
    private final Double        min;
    private final Double        max;

    public Timing(Timing value) {
        this.id = value.id;
        this.key = value.key;
        this.host = value.host;
        this.beginTime = value.beginTime;
        this.endTime = value.endTime;
        this.total = value.total;
        this.mean = value.mean;
        this.variance = value.variance;
        this.min = value.min;
        this.max = value.max;
    }

    public Timing(
        Long          id,
        String        key,
        String        host,
        LocalDateTime beginTime,
        LocalDateTime endTime,
        Long          total,
        Double        mean,
        Double        variance,
        Double        min,
        Double        max
    ) {
        this.id = id;
        this.key = key;
        this.host = host;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.total = total;
        this.mean = mean;
        this.variance = variance;
        this.min = min;
        this.max = max;
    }

    public Long getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public String getHost() {
        return this.host;
    }

    public LocalDateTime getBeginTime() {
        return this.beginTime;
    }

    public LocalDateTime getEndTime() {
        return this.endTime;
    }

    public Long getTotal() {
        return this.total;
    }

    public Double getMean() {
        return this.mean;
    }

    public Double getVariance() {
        return this.variance;
    }

    public Double getMin() {
        return this.min;
    }

    public Double getMax() {
        return this.max;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Timing (");

        sb.append(id);
        sb.append(", ").append(key);
        sb.append(", ").append(host);
        sb.append(", ").append(beginTime);
        sb.append(", ").append(endTime);
        sb.append(", ").append(total);
        sb.append(", ").append(mean);
        sb.append(", ").append(variance);
        sb.append(", ").append(min);
        sb.append(", ").append(max);

        sb.append(")");
        return sb.toString();
    }
}
