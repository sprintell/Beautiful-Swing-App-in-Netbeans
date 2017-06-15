

package AppPackage;

/*
 * @author Mosaku Abayomi
 */

import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;


public class PieChart3D  {

    public PieDataset createSampleDataset(String[] titles,int[] cost) {
        
        final DefaultPieDataset result = new DefaultPieDataset();
        
        for (int i=0; i<=titles.length-1;i++)
        {
            result.setValue(titles[i], new Double(cost[i]));
        }
        
        
        /*
        result.setValue("Java", new Double(43.2));
        result.setValue("Visual Basic", new Double(10.0));
        result.setValue("C/C++", new Double(17.5));
        result.setValue("PHP", new Double(32.5));
        result.setValue("Perl", new Double(1.0));
        */
        return result;
        
    }
    
    
    /**
     * Creates a sample chart.
     * 
     * @param dataset  the dataset.
     * 
     * @return A chart.
     */
    public JFreeChart createChart(final PieDataset dataset) {
        
        final JFreeChart chart = ChartFactory.createPieChart3D(
            "",  // chart title
            dataset,                // data
            true,                   // include legend
            true,
            false
        );

        
        final PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        //plot.setForegroundAlpha(0.5f);
        plot.setNoDataMessage("No data to display");
        
        
        plot.setBackgroundPaint(Color.white);
        
       plot.setOutlinePaint(Color.white);
        
        return chart;
        
    }


}
