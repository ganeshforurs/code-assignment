package com.singtel.assignment.animal.butterfly;

import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.utils.InsectStateEnum;

/**
 * Author Ganesh T
 * crated by 22-Aug-2021
 */

public class Butterfly extends Animal {
    private InsectStateEnum state;
    private Butterfly currentState;

    public Butterfly getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Butterfly currentState) {
        this.currentState = currentState;
    }

    public Butterfly() {

    }

    public Butterfly(InsectStateEnum state) {
        this.setState(state);
        this.setCurrentState(new CatterpillarState());
    }

    public InsectStateEnum getState() {
        return state;
    }

    public void setState(InsectStateEnum state) {
        this.state = state;
    }

    public void transform() {
        this.setCurrentState(new ButterFlyState());
    }

}
