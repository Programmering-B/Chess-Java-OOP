package com.company.brikker;

import com.company.Braet;
import com.company.Felt;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Springer extends Brik {
    public static Image billedHvid, billedSort;

    public Springer(Felt felt, boolean erHvid) {
        super(felt, erHvid);
    }

    public List<Felt> tilladteTraek(Braet braet) {

        List<Felt> tilladte = new LinkedList<Felt>();
        // tilføjer alle traek som er diagonale retninger
        for(int x = -1; x <= 1; x+= 2) {
            for(int y = -1; y <= 1; y += 2) {
                lavTilladteTraekForRetning(tilladte, braet, x, y);
            }
        }
        return tilladte;
    }

    public Image billed() {
        if (erHvid()) {
            return billedHvid;
        }
        else {
            return billedSort;
        }
    }
}
