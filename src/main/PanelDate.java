package main;

import java.awt.Component;
import java.util.Calendar;
import java.util.Date;

public class PanelDate extends javax.swing.JLayeredPane {

    private int month;
    private int year;

    public PanelDate(int month, int year) {
        initComponents();
        this.month = month;
        this.year = year;
        init();
    }

    private void init() {
        mon.asTitle();
        tue.asTitle();
        wed.asTitle();
        thu.asTitle();
        fri.asTitle();
        sat.asTitle();
        sun.asTitle();
        setDate();
    }

    private void setDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);  //  month jan as 0 so start from 0
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;  //  get day of week -1 to index
        calendar.add(Calendar.DATE, -startDay);
        ToDay toDay = getToDay();
        for (Component com : getComponents()) {
            Cell cell = (Cell) com;
            if (!cell.isTitle()) {
                cell.setText(calendar.get(Calendar.DATE) + "");
                cell.setDate(calendar.getTime());
                cell.currentMonth(calendar.get(Calendar.MONTH) == month - 1);
                if (toDay.isToDay(new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR)))) {
                    cell.setAsToDay();
                }
                calendar.add(Calendar.DATE, 1); //  up 1 day
            }
        }
    }

    private ToDay getToDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sun = new main.Cell();
        mon = new main.Cell();
        tue = new main.Cell();
        wed = new main.Cell();
        thu = new main.Cell();
        fri = new main.Cell();
        sat = new main.Cell();
        cell8 = new main.Cell();
        cell9 = new main.Cell();
        cell10 = new main.Cell();
        cell11 = new main.Cell();
        cell12 = new main.Cell();
        cell13 = new main.Cell();
        cell14 = new main.Cell();
        cell15 = new main.Cell();
        cell16 = new main.Cell();
        cell17 = new main.Cell();
        cell18 = new main.Cell();
        cell19 = new main.Cell();
        cell20 = new main.Cell();
        cell21 = new main.Cell();
        cell22 = new main.Cell();
        cell23 = new main.Cell();
        cell24 = new main.Cell();
        cell25 = new main.Cell();
        cell26 = new main.Cell();
        cell27 = new main.Cell();
        cell28 = new main.Cell();
        cell29 = new main.Cell();
        cell30 = new main.Cell();
        cell31 = new main.Cell();
        cell32 = new main.Cell();
        cell33 = new main.Cell();
        cell34 = new main.Cell();
        cell35 = new main.Cell();
        cell36 = new main.Cell();
        cell37 = new main.Cell();
        cell38 = new main.Cell();
        cell39 = new main.Cell();
        cell40 = new main.Cell();
        cell41 = new main.Cell();
        cell42 = new main.Cell();
        cell43 = new main.Cell();
        cell44 = new main.Cell();
        cell45 = new main.Cell();
        cell46 = new main.Cell();
        cell47 = new main.Cell();
        cell48 = new main.Cell();
        cell49 = new main.Cell();

        setLayout(new java.awt.GridLayout(7, 7));

        sun.setForeground(new java.awt.Color(222, 12, 12));
        sun.setText("Sun");
        sun.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(sun);

        mon.setText("Mon");
        mon.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(mon);

        tue.setText("Tue");
        tue.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(tue);

        wed.setText("Wed");
        wed.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(wed);

        thu.setText("Thu");
        thu.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(thu);

        fri.setText("Fri");
        fri.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(fri);

        sat.setText("Sat");
        sat.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(sat);

        cell8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell8);

        cell9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell9);

        cell10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell10);

        cell11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell11);

        cell12.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell12);

        cell13.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell13);

        cell14.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell14);

        cell15.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell15);

        cell16.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell16);

        cell17.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell17);

        cell18.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell18);

        cell19.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell19);

        cell20.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell20);

        cell21.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell21);

        cell22.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell22);

        cell23.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell23);

        cell24.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell24);

        cell25.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell25);

        cell26.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell26);

        cell27.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell27);

        cell28.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell28);

        cell29.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell29);

        cell30.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell30);

        cell31.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell31);

        cell32.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell32);

        cell33.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell33);

        cell34.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell34);

        cell35.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell35);

        cell36.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell36);

        cell37.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell37);

        cell38.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell38);

        cell39.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell39);

        cell40.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell40);

        cell41.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell41);

        cell42.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell42);

        cell43.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell43);

        cell44.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell44);

        cell45.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell45);

        cell46.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell46);

        cell47.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell47);

        cell48.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell48);

        cell49.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell49);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.Cell cell10;
    private main.Cell cell11;
    private main.Cell cell12;
    private main.Cell cell13;
    private main.Cell cell14;
    private main.Cell cell15;
    private main.Cell cell16;
    private main.Cell cell17;
    private main.Cell cell18;
    private main.Cell cell19;
    private main.Cell cell20;
    private main.Cell cell21;
    private main.Cell cell22;
    private main.Cell cell23;
    private main.Cell cell24;
    private main.Cell cell25;
    private main.Cell cell26;
    private main.Cell cell27;
    private main.Cell cell28;
    private main.Cell cell29;
    private main.Cell cell30;
    private main.Cell cell31;
    private main.Cell cell32;
    private main.Cell cell33;
    private main.Cell cell34;
    private main.Cell cell35;
    private main.Cell cell36;
    private main.Cell cell37;
    private main.Cell cell38;
    private main.Cell cell39;
    private main.Cell cell40;
    private main.Cell cell41;
    private main.Cell cell42;
    private main.Cell cell43;
    private main.Cell cell44;
    private main.Cell cell45;
    private main.Cell cell46;
    private main.Cell cell47;
    private main.Cell cell48;
    private main.Cell cell49;
    private main.Cell cell8;
    private main.Cell cell9;
    private main.Cell fri;
    private main.Cell mon;
    private main.Cell sat;
    private main.Cell sun;
    private main.Cell thu;
    private main.Cell tue;
    private main.Cell wed;
    // End of variables declaration//GEN-END:variables
}
