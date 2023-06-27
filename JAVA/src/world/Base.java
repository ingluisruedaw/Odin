
package world;

import easter.GaussSunday;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;

/**
 *
 * @author LUIS DOMINGO RUEDA WILCHES <ingluisruedaw@gmail.com>
 */
public abstract class Base extends GaussSunday {

    private final int defaultValue;
    private final int minYear;
    
    protected Base(int year){
        super(year);
        this.defaultValue = 7;
        this.minYear = 1984;
    }
    
    public abstract LocalDate[] Run();
    public abstract Map<String, LocalDate> RunWithDetails();
    public abstract boolean isWorkingDay(
            LocalDate localDate, 
            boolean supportSaturday);
    
    /**
     *
     * @param localDate date to comparer
     * @return date type LocalDate
     */
    protected LocalDate EmilianiLaw(LocalDate localDate)
    {
        var date = localDate;
        if (this.GetYear() >= this.minYear)
        {
            int value = localDate.getDayOfWeek().ordinal();
            if(value != 0) {
                date = localDate.plusDays((this.defaultValue 
                        - localDate.getDayOfWeek().ordinal()));
            }
        }

        return date;
    }
    
    protected boolean FindDate(LocalDate[] lista, LocalDate localDate){
        return Arrays.stream(lista).anyMatch(x -> 
                x.equals(localDate));
    }
    
    protected LocalDate NewYear()
    {
        return LocalDate.of(this.GetYear(), 1, 1);
    }
    
    protected LocalDate HolyThursday()
    {
        return this.GetResurrection().minusDays(3);
    }

    protected LocalDate HolyFriday()
    {
        return this.GetResurrection().minusDays(2);
    }
    
    protected LocalDate LaborDay()
    {
        return LocalDate.of(this.GetYear(), 5, 1);
    }
    
    protected LocalDate Christmas()
    {
        return LocalDate.of(this.GetYear(), 12, 25);
    }
    
    /*COLOMBIA*/
    protected LocalDate ThreeKing()
    {
        return this.EmilianiLaw(LocalDate.of(this.GetYear(), 
                1, 6));
    }

    protected LocalDate SaintJoseph()
    {
        return this.EmilianiLaw(LocalDate.of(this.GetYear(),
                3, 19));
    }
    
    protected LocalDate PalmSunday()
    {
        return this.GetResurrection().minusDays(7);
    }    

    protected LocalDate Ascension()
    {
        return this.GetResurrection().plusDays(43);
    }

    protected LocalDate CorpusChristi()
    {
        return this.GetResurrection().plusDays(64);
    }

    protected LocalDate SacredHeartChrist()
    {
        return this.GetResurrection().plusDays(71);
    }
    
    protected LocalDate SaintPeter()
    {
        return this.EmilianiLaw(LocalDate.of(this.GetYear(),
                6, 29));
    }

    protected LocalDate ColombiaIndependenceDay()
    {
        return LocalDate.of(this.GetYear(), 7, 20);
    }

    protected LocalDate BattleBoyaca()
    {
        return LocalDate.of(this.GetYear(), 8, 7);
    }

    protected LocalDate Asuncion()
    {
        return this.EmilianiLaw(LocalDate.of(this.GetYear(),
                8, 15));
    }

    protected LocalDate ColumbusDay()
    {
        return this.EmilianiLaw(LocalDate.of(this.GetYear(), 
                10, 12));
    }

    protected LocalDate AllSaints()
    {
        return this.EmilianiLaw(LocalDate.of(this.GetYear(), 
                11, 1));
    }

    protected LocalDate IndependenceCartagena()
    {
        return this.EmilianiLaw(LocalDate.of(this.GetYear(), 
                11, 11));
    }

    protected LocalDate InmaculateMary()
    {
        return LocalDate.of(this.GetYear(), 12, 8);
    }
    
    /*VENEZUELA*/
    protected LocalDate CarnivalMonday()
    {
        return this.GetResurrection().minusDays(48);
    }
    
    protected LocalDate CarnivalTuesday()
    {
        return this.GetResurrection().minusDays(47);
    }
    
    protected LocalDate DeclarationOfIndependence()
    {
        //Ley de Fiestas Nacionales
        return LocalDate.of(this.GetYear(), 4, 19);
    }
    
    protected LocalDate BattleCarabobo()
    {
        //Ley de Fiestas Nacionales
        return LocalDate.of(this.GetYear(), 6, 24);
    }
    
    protected LocalDate VenezuelaIndependenceDay()
    {
        return LocalDate.of(this.GetYear(), 7, 5);
    }
    
    protected LocalDate SimonBolivarDay()
    {
        //Ley de Fiestas Nacionales
        return LocalDate.of(this.GetYear(), 7, 24);
    }
    
    protected LocalDate IndigenousResistanceDay()
    {
        //Ley de Fiestas Nacionales
        return LocalDate.of(this.GetYear(), 10, 12);
    }
    
    protected LocalDate ChristmasEve()
    {
        return LocalDate.of(this.GetYear(), 12, 24);
    }
    
    protected LocalDate EndYear()
    {
        return LocalDate.of(this.GetYear(), 12, 31);
    }
}