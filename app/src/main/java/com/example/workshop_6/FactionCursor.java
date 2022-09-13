package com.example.workshop_6;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.example.workshop_6.FactionSchema.FactionTable;

public class FactionCursor extends CursorWrapper
{
    public FactionCursor(Cursor cursor)
    {
        super(cursor);
    }

    public Faction getFaction()
    {
        int id = getInt( getColumnIndex( FactionTable.Cols.ID ) );
        String name = getString( getColumnIndex( FactionTable.Cols.NAME ) );
        int stregth = getInt( getColumnIndex( FactionTable.Cols.STRENGTH ) );
        int relationship = getInt( getColumnIndex( FactionTable.Cols.RELATIONSHIP ) );

        return new Faction(id, name, stregth, relationship);
    }
}
