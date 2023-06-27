namespace CSHARP.world
{
    public class Venezuela : Base
    {
        public Venezuela(int year) : base(year)
        {

        }

        public override bool isWorkingDay(DateTime localDate,
            bool supportSaturday)
        {
            if (supportSaturday)
            {
                if (localDate.DayOfWeek == DayOfWeek.Saturday)
                {
                    return false;
                }
            }

            if (localDate.DayOfWeek == DayOfWeek.Sunday)
            {
                return false;
            }

            return !this.FindDate(this.Run(), localDate);
        }

        public override DateTime[] Run()
        {
            DateTime[] list = new DateTime[14];
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

        public override Dictionary<string, DateTime> RunWithDetails()
        {
            return new Dictionary<string, DateTime>
            {
                { "New Year", this.NewYear() },
                { "Carnival Monday", this.CarnivalMonday() },
                { "Carnival Tuesday", this.CarnivalTuesday() },
                { "Holy Thursday", this.HolyThursday() },
                { "Holy Friday", this.HolyFriday() },
                { "Declaration Of Independence", 
                    this.DeclarationOfIndependence() },
                { "Labor Day", this.LaborDay() },
                { "Carabobo's Battle", this.BattleCarabobo() },
                { "Independence Day", 
                    this.VenezuelaIndependenceDay() },
                { "Simon Bolivar's Day", this.SimonBolivarDay() },
                { "Indigenous Resistance Day", 
                    this.IndigenousResistanceDay() },
                { "Christmas Eve", this.ChristmasEve() },
                { "Christmas", this.Christmas() },
                { "End Of The Year's Party", this.EndYear() }
            };
        }
    }
}
