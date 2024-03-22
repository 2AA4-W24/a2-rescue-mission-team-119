package ca.mcmaster.se2aa4.island.team119;

import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecisionMakerTest {

    private DecisionMaker decisionMaker;
    private Drone drone;
    private Map map;

    @BeforeEach
    public void setUp() {
        drone = new Drone("E", 7000);
        map = new Map(); // You may need to set up the map accordingly
        decisionMaker = new DecisionMaker(drone, map);
    }


}