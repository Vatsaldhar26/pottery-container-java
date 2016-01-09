package uk.ac.cam.cl.dtg.teaching.programmingtest.java;

import java.util.LinkedList;
import java.util.List;

public class FittedExponential extends FittedCurve {
	
	public FittedExponential(double[] x, double[] y) {
		super(x, y);
	}

	@Override
	protected double unmapY(double y) {
		return Math.pow(10,y);
	}
	
	@Override
	protected List<Point> mapValues(double[] x, double[] y) {

		List<Point> result = new LinkedList<Point>();
		for(int i=0;i<x.length;++i) {	
			Point p = new Point();
        	p.xCoeff = new double[] { x[i] };
        	p.y = Math.log(y[i]);
            result.add(p);
        }
        return result;
	}

	@Override
	protected String getName() {
		return "o(2^n)";
		
	}

}
