package ca.mcmaster.se2aa4.island.team119;

public class ReturnHome implements SearchState{

    DecisionMaker decisionHandler;
    private final SearchStateName name = SearchStateName.SEARCHISLAND;
    private Boolean finished;

    ReturnHome(DecisionMaker decisionHandler){
        this.decisionHandler = decisionHandler;
    }

    public Operation handle() {
        return new Operation(Action.STOP);
    }

    @Override
    public Boolean isFinished() {
        return this.finished;
    }

    @Override
    public SearchStateName getName() {
        return this.name;
    }


}
