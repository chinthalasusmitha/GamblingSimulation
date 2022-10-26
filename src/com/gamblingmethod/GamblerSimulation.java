package com.gamblingmethod;

public class GamblerSimulation {
    private int stake = 100;
    private int betValue = 1;

    public int getStake() {
        return stake;
    }

    public void setStake(int stake) {
        this.stake = stake;
    }

    public int getBetValue() {
        return betValue;
    }

    public void setBetValue(int betValue) {
        this.betValue = betValue;
    }

    @Override
    public String toString() {
        return "GamblerSimulation{" +
                "stake=" + stake +
                ", betValue=" + betValue +
                '}';
    }
}
