package com.example.coachemds.outils;

import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class MesOutils
{
    /**
     * Conversion chaine sous format Thu Mar 28 12:22:52 GMT 2019 (EEE MMM dd hh:mm:ss 'GMT' yyyy) vers date
     * @param uneDate
     * @return
     */
    public static Date convertStringToDate(String uneDate)
    {
        return convertStringToDate(uneDate, "EEE MMM dd hh:mm:ss 'GMT' yyyy");
    }

    /**
     * Conversion d'une chaine sous format reçu en paramètre vers une date
     * @param uneDate
     * @param formatAttendu
     * @return
     */
    public static Date convertStringToDate(String uneDate, String formatAttendu)
    {

        SimpleDateFormat formatter = new SimpleDateFormat(formatAttendu);

        try
        {
            Date date = formatter.parse(uneDate);

            return date;

        } catch (ParseException e) {
            Log.d("Erreur", "******parse de la date impossible*******"+e.toString());
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Conversion d'une date en chaine sous la forme yyyy-MM-dd hh:mm:ss
     * @param uneDate
     * @return
     */
    public static String convertDateToString(Date uneDate)
    {
        String formatAttendu = "yyyy-MM-dd hh:mm:ss";

        SimpleDateFormat date = new SimpleDateFormat(formatAttendu);

        return date.format(uneDate);

    }

    /**
     * retourne un float au format String avec un chiffre après la virgule
     * @param valeur
     * @return
     */
    public static String format2Decimal(Float valeur)
    {

        return String.format("%.01f", valeur);
    }

}
