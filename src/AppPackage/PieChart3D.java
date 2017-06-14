/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2004, by Object Refinery Limited and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc. 
 * in the United States and other countries.]
 *
 * --------------------
 * PieChart3DDemo1.java
 * --------------------
 * (C) Copyright 2002-2004, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * $Id: PieChart3DDemo1.java,v 1.8 2004/04/26 19:12:00 taqua Exp $
 *
 * Changes
 * -------
 * 19-Jun-2002 : Version 1 (DG);
 * 31-Jul-2002 : Updated with changes to Pie3DPlot class (DG);
 * 11-Oct-2002 : Fixed errors reported by Checkstyle (DG);
 * 23-Dec-2003 : Renamed Pie3DChartDemo1 --> PieChart3DDemo1 (DG);
 *
 */

package AppPackage;

import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.Rotation;

/**
 * A simple demonstration application showing how to create a pie chart using data from a
 * {@link DefaultPieDataset}.
 *
 */
public class PieChart3D  {

 
    /**
     * Creates a sample dataset for the demo.
     * 
     * @return A sample dataset.
     */
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
