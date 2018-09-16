package com.fengkun.design_pattern.state.enum_advance;

/**
 * Created by fengkunangel on 2018/9/16.
 */
public enum State {

    TEEN() {
        @Override
        public void perform() {
            System.out.println("少年");
        }

        @Override
        public State nextState() {
            return YOUTH;
        }
    },

    YOUTH() {
        @Override
        public void perform() {
            System.out.println("青年");
        }

        @Override
        public State nextState() {
            return ELD;
        }
    },

    ELD() {
        @Override
        public void perform() {
            System.out.println("老年");
        }

        @Override
        public State nextState() {
            return TEEN;
        }
    };

    public abstract void perform();

    public abstract State nextState();
}
