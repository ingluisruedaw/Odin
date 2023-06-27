
package world;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LUIS DOMINGO RUEDA WILCHES <ingluisruedaw@gmail.com>
 */
public class Colombia extends Base {
    
    public Colombia(int year)
    {        
        super(year);
    }    
    
    @Override
    public LocalDate[] Run()
    {
        LocalDate[] list = new LocalDate[20];
        list[0] = this.NewYear();
        list[1] = this.ThreeKing();
        list[2] = this.SaintJoseph();
        list[3] = this.PalmSunday();
        list[4] = this.HolyThursday();
        list[5] = this.HolyFriday();
        list[6] = this.GetResurrection();
        list[7] = this.LaborDay();
        list[8] = this.Ascension();
        list[9] = this.CorpusChristi();
        list[10] = this.SacredHeartChrist();
        list[11] = this.SaintPeter();
        list[12] = this.ColombiaIndependenceDay();
        list[13] = this.BattleBoyaca();
        list[14] = this.Asuncion();
        list[15] = this.ColumbusDay();
        list[16] = this.AllSaints();
        list[17] = this.IndependenceCartagena();
        list[18] = this.InmaculateMary();
        list[19] = this.Christmas();
        
        return list;
    }
    
    @Override
    public boolean isWorkingDay(LocalDate localDate, boolean supportSaturday)
    {
        if (supportSaturday)
        {
            if (localDate.getDayOfWeek().equals(DayOfWeek.SATURDAY))
            {
                return false;
            }
        }

        if (localDate.getDayOfWeek().equals(DayOfWeek.SUNDAY))
        {
            return false;
        }
        
        return !this.FindDate(this.Run(), localDate);
    }

    @Override
    public Map<String, LocalDate> RunWithDetails() {
        Map<String, LocalDate> list = new HashMap<>();
        list.put("New Year", this.NewYear());
        list.put("Three Kings Day", this.ThreeKing());
        list.put("St. Joseph's Day", this.SaintJoseph());
        list.put("Palm Sunday", this.PalmSunday());
        list.put("Holy Thursday", this.HolyThursday());
        list.put("Holy Friday", this.HolyFriday());
        list.put("Easter Sunday", this.GetResurrection());
        list.put("Labor Day", this.LaborDay());
        list.put("Ascension day", this.Ascension());
        list.put("Corpus Christi", this.CorpusChristi());
        list.put("Sacred heart", this.SacredHeartChrist());
        list.put("Saint Peter and Saint Paul", this.SaintPeter());
        list.put("Independence Day", this.ColombiaIndependenceDay());
        list.put("Boyaca's Battle", this.BattleBoyaca());
        list.put("The Assumption of the Virgin", this.Asuncion());
        list.put("Columbus Day", this.ColumbusDay());
        list.put("All Saints", this.AllSaints());
        list.put("Independence of Cartagena", 
                this.IndependenceCartagena());
        list.put("Immaculate Conception's Day", 
                this.InmaculateMary());
        list.put("Christmas Day", this.Christmas());
        
        return list;
    }
}