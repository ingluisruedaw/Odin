namespace CSHARP.world;

public class Colombia : Base
{
    public Colombia(int year): base(year)
    {

    }

    public override bool isWorkingDay(DateTime localDate, bool supportSaturday)
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
        DateTime[] list = new DateTime[20];
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

    public override Dictionary<string, DateTime> RunWithDetails()
    {
        return new Dictionary<string, DateTime>
        {
            { "New Year", this.NewYear() },
            { "Three Kings Day", this.ThreeKing() },
            { "St. Joseph's Day", this.SaintJoseph() },
            { "Palm Sunday", this.PalmSunday() },
            { "Holy Thursday", this.HolyThursday() },
            { "Holy Friday", this.HolyFriday() },
            { "Easter Sunday", this.GetResurrection() },
            { "Labor Day", this.LaborDay() },
            { "Ascension day", this.Ascension() },
            { "Corpus Christi", this.CorpusChristi() },
            { "Sacred heart", this.SacredHeartChrist() },
            { "Saint Peter and Saint Paul", this.SaintPeter() },
            { "Independence Day", this.ColombiaIndependenceDay() },
            { "Boyaca's Battle", this.BattleBoyaca() },
            { "The Assumption of the Virgin", this.Asuncion() },
            { "Columbus Day", this.ColumbusDay() },
            { "All Saints", this.AllSaints() },
            { "Independence of Cartagena", this.IndependenceCartagena() },
            { "Immaculate Conception's Day", this.InmaculateMary() },
            { "Christmas Day", this.Christmas() }
        };
    }
}