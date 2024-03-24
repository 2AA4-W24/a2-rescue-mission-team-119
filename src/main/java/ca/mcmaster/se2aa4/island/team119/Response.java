package ca.mcmaster.se2aa4.island.team119;

import org.json.JSONObject;

public abstract class Response {

    private Integer cost;
    private JSONObject extras;
    private String status;
    private ResultType type;

    Response(JSONObject responseInfo, Operation prevOperation) {
        this.cost = responseInfo.getInt("cost");
        this.status = responseInfo.getString("status");
        this.extras = responseInfo.getJSONObject("extras");
        setType(prevOperation);
    }

    private void setType(Operation prevOperation) {
        switch (prevOperation.getAction()) {
            case SCAN -> { this.type = ResultType.SCANRESULT; }
            case ECHOFORWARD -> { this.type = ResultType.ECHOFWDRESULT; }
            case ECHORIGHT -> { this.type = ResultType.ECHORIGHTRESULT; }
            case ECHOLEFT -> { this.type = ResultType.ECHOLEFTRESULT; }
            case FLYFORWARD -> { this.type = ResultType.FLYFWDRESULT; }
            case FLYRIGHT -> { this.type = ResultType.FLYRIGHTRESULT; }
            case FLYLEFT -> { this.type = ResultType.FLYLEFTRESULT; }
            case STOP -> { this.type = ResultType.STOPRESULT; }
        }
    }

    public ResultType getType() {
        return this.type;
    }

    public Integer getCost() {
        return this.cost;
    }

    protected JSONObject getExtras() {
        return this.extras;
    }

    public String getStatus() {
        return this.status;
    }
}

