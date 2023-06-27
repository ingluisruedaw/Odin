namespace CSHARP.easter;

public class GaussSunday
{
    private readonly DateTime Resurrection;

    private readonly int Year;

    protected GaussSunday(int year)
    {
        this.Year = year;
        this.Resurrection = this.Execute();
    }

    private DateTime Execute()
    {
        var a = this.Year % 19;
        var b = this.Year % 4;
        var c = this.Year % 7;

        double t = this.Year / 100;
        var k = (int)(t);

        t = (13 + 8 * k) / 25;
        var p = (int)(t);

        t = k / 4;
        var q = (int)(t);

        var m = (15 - p + k - q) % 30;
        var n = (4 + k - q) % 7;
        var d = (19 * a + m) % 30;
        var e = (2 * b + 4 * c + 6 * d + n) % 7;

        var r = d + e < 10
            ? new DateTime(this.Year, 3, d + e + 22)
            : new DateTime(this.Year, 4, d + e - 9);

        if (r == new DateTime(this.Year, 4, 26))
            r = new DateTime(this.Year, 4, 19);

        if (r == new DateTime(this.Year, 4, 25) 
            && d == 28 && e == 6 && a > 10)
            r = new DateTime(this.Year, 4, 18);

        return r;
    }

    public DateTime GetResurrection()
    {
        return this.Resurrection;
    }

    public int GetYear()
    {
        return this.Year;
    }
}