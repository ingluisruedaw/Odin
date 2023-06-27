
using CSHARP.easter;

namespace CSHARP.world;

public abstract class Base : GaussSunday
{
    private readonly int defaultValue;
    private readonly int minYear;

    public Base(int year) : base(year) {
        this.defaultValue = 7;
        this.minYear = 1984;
    }

    public abstract DateTime[] Run();
    public abstract Dictionary<string, DateTime> RunWithDetails();
    public abstract bool isWorkingDay(DateTime localDate, bool supportSaturday);

    /**
     *
     * @param localDate date to comparer
     * @return date type LocalDate
     */
    protected DateTime EmilianiLaw(DateTime localDate)
    {
        var date = localDate;
        if (this.GetYear() >= this.minYear)
        {
            int value = (int)localDate.DayOfWeek;

            if (value == default)
            {
                date = localDate.AddDays(1);
            }
            else if (value > 1)
            {
                date = localDate.AddDays((this.defaultValue - value + 1));
            }
        }

        return date;
    }

    protected bool FindDate(DateTime[] lista, DateTime localDate)
    {
            return lista.Any(x => x.Equals(localDate));
    }

    protected DateTime NewYear()
    {
        return new DateTime(this.GetYear(), 1, 1);
    }

    protected DateTime HolyThursday()
    {
        return this.GetResurrection().AddDays(-3);
    }

    protected DateTime HolyFriday()
    {
        return this.GetResurrection().AddDays(-2);
    }

    protected DateTime LaborDay()
    {
        return new DateTime(this.GetYear(), 5, 1);
    }

    protected DateTime Christmas()
    {
        return new DateTime(this.GetYear(), 12, 25);
    }

    /*COLOMBIA*/
    protected DateTime ThreeKing()
    {
        return this.EmilianiLaw(new DateTime(this.GetYear(), 1, 6));
    }

    protected DateTime SaintJoseph()
    {
        return this.EmilianiLaw(new DateTime(this.GetYear(), 3, 19));
    }

    protected DateTime PalmSunday()
    {
        return this.GetResurrection().AddDays(-7);
    }

    protected DateTime Ascension()
    {
        return this.GetResurrection().AddDays(43);
    }

    protected DateTime CorpusChristi()
    {
        return this.GetResurrection().AddDays(64);
    }

    protected DateTime SacredHeartChrist()
    {
        return this.GetResurrection().AddDays(71);
    }

    protected DateTime SaintPeter()
    {
        return this.EmilianiLaw(new DateTime(this.GetYear(), 6, 29));
    }

    protected DateTime ColombiaIndependenceDay()
    {
        return new DateTime(this.GetYear(), 7, 20);
    }

    protected DateTime BattleBoyaca()
    {
        return new DateTime(this.GetYear(), 8, 7);
    }

    protected DateTime Asuncion()
    {
        return this.EmilianiLaw(new DateTime(this.GetYear(), 8, 15));
    }

    protected DateTime ColumbusDay()
    {
        return this.EmilianiLaw(new DateTime(this.GetYear(), 10, 12));
    }

    protected DateTime AllSaints()
    {
        return this.EmilianiLaw(new DateTime(this.GetYear(), 11, 1));
    }

    protected DateTime IndependenceCartagena()
    {
        return this.EmilianiLaw(new DateTime(this.GetYear(), 11, 11));
    }

    protected DateTime InmaculateMary()
    {
        return new DateTime(this.GetYear(), 12, 8);
    }

    /*VENEZUELA*/
    protected DateTime CarnivalMonday()
    {
        return this.GetResurrection().AddDays(-48);
    }

    protected DateTime CarnivalTuesday()
    {
        return this.GetResurrection().AddDays(-47);
    }

    protected DateTime DeclarationOfIndependence()
    {
        //Ley de Fiestas Nacionales
        return new DateTime(this.GetYear(), 4, 19);
    }

    protected DateTime BattleCarabobo()
    {
        //Ley de Fiestas Nacionales
        return new DateTime(this.GetYear(), 6, 24);
    }

    protected DateTime VenezuelaIndependenceDay()
    {
        return new DateTime(this.GetYear(), 7, 5);
    }

    protected DateTime SimonBolivarDay()
    {
        //Ley de Fiestas Nacionales
        return new DateTime(this.GetYear(), 7, 24);
    }

    protected DateTime IndigenousResistanceDay()
    {
        //Ley de Fiestas Nacionales
        return new DateTime(this.GetYear(), 10, 12);
    }

    protected DateTime ChristmasEve()
    {
        return new DateTime(this.GetYear(), 12, 24);
    }

    protected DateTime EndYear()
    {
        return new DateTime(this.GetYear(), 12, 31);
    }
}