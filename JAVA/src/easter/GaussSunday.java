
package easter;

import java.time.LocalDate;

/**
 *
 * @author LUIS DOMINGO RUEDA WILCHES <ingluisruedaw@gmail.com>
 */
public class GaussSunday {
    private final LocalDate Resurrection;

    private final int Year;

    protected GaussSunday(int year)
    {
        this.Year = year;
        this.Resurrection = this.Execute();
    }    
    
    private LocalDate Execute()
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
            ? LocalDate.of(this.Year, 3, d + e + 22)
            : LocalDate.of(this.Year, 4, d + e - 9);

        int dayOfMonth = 26;
        if (r.isEqual(LocalDate.of(this.Year, 4, dayOfMonth)))
            r = LocalDate.of(this.Year, 4, 19);

        dayOfMonth = 25;
        if (r.isEqual(LocalDate.of(this.Year, 4, dayOfMonth))
                && d == 28 && e == 6 && a > 10)
            r = LocalDate.of(this.Year, 4, 18);

        return r;
    }
    
    public LocalDate GetResurrection()
    {
        return this.Resurrection;
    }

    public int GetYear()
    {
        return this.Year;
    }
}
