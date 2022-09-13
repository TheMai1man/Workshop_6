package com.example.workshop_6;

public class FactionSchema
{
    public static class FactionTable
    {
        public static final String NAME = "factions";
        public static class Cols
        {
            public static final String ID = "faction_id";
            public static final String NAME = "faction_name";
            public static final String STRENGTH = "faction_strength";
            public static final String RELATIONSHIP = "faction_relationship";
        }
    }
}
