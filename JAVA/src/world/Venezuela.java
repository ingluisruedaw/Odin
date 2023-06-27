
package world;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LUIS DOMINGO RUEDA WILCHES <ingluisruedaw@gmail.com>
 */
public class Venezuela extends Base{

    public Venezuela(int year)
    {
        super(year);
    }
    
    @Override
    public LocalDate[] Run()
    {
        LocalDate[] list = new LocalDate[14];
        list[0] = this.NewYear();        
        list[1] = this.CarnivalMonday();
        list[2] = this.CarnivalTuesday();
        list[3] = this.HolyThursday();
        list[4] = this.HolyFriday();
        list[5] = this.DeclarationOfIndependence();
        list[6] = this.LaborDay();
        list[7] = this.BattleCarabobo();
        list[8] = this.VenezuelaIndependenceDay();
        list[9] = this.SimonBolivarDay();
        list[10] = this.IndigenousResistanceDay();
        list[11] = this.ChristmasEve();
        list[12] = this.Christmas();
        list[13] = this.EndYear();        
        
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
        list.put("Carnival Monday", this.CarnivalMonday());
        list.put("Carnival Tuesday", this.CarnivalTuesday());
        list.put("Holy Thursday", this.HolyThursday());
        list.put("Holy Friday", this.HolyFriday());
        list.put("Declaration Of Independence", 
                this.DeclarationOfIndependence());
        list.put("Labor Day", this.LaborDay());
        list.put("Carabobo's Battle", this.BattleCarabobo());
        list.put("Independence Day", this.VenezuelaIndependenceDay());
        list.put("Simon Bolivar's Day", this.SimonBolivarDay());
        list.put("Indigenous Resistance Day", 
                this.IndigenousResistanceDay());
        list.put("Christmas Eve", this.ChristmasEve());
        list.put("Christmas", this.Christmas());
        list.put("End Of The Year's Party", this.EndYear());        
        
        return list; 
    }
}