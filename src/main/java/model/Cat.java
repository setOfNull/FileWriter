package model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cat {
private Status status;
@JsonProperty("_id")
private String id;
private String user;
private String text;
@JsonProperty("_v")
private int v;
private String source;
private String type;
private boolean deleted;
private boolean used;

    @Override
    public String toString() {
        return "Cat{" +
                "status: " +"\n" + status +
                " _id: \"" + id + "\"" + "\n"+
                " user: \"" + user + "\"" +"\n"+
                " text: \"" + text + "\"" + "\n"+
                " _v: \"" + v + "\"" + "\n"+
                " source: \"" + source + "\"" + "\n"+
                " type: \"" + type + "\"" + "\n"+
                " deleted: \"" + deleted + "\"" + "\n"+
                " used: \"" + used + "\"" +
                '}' +"\n";
    }

    @Data
static class Status{
    private boolean verified;
    private String feedback;
    private int sentCount;

        @Override
        public String toString() {
            return   "      verified: \"" + verified + "\"" + "\n" +
                     "      feedback: \"" + feedback + "\"" + "\n" +
                     "      sentCount: \"" + sentCount + "\"" + "\n";
        }
    }
}
