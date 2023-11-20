/*************************************************************/
/* Copyright (C) 2023 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Neighbor System, Site-based, License 17353 17353,
 * at 16th Fl. IT Venture Tower (East), 135, Jungdae-ro, Songpa-Gu, Seoul 05717, Korea. */
/* Abstract syntax: j2735_cits_20201125 */
/* ASN.1 Java project: dsrc.Dsrc */
/* Created: Wed Jul 12 11:40:42 2023 */
/* ASN.1 Compiler for Java version: 7.2 */
/* ASN.1 compiler options and file names specified:
 * -output dsrc -nouniquepdu -per -uper -ber -der -cer -json -root
 * -pdusforopentypes -messageFormat msvc
 * D:/OSS_ASN1/Project/POLICE/J2735_CITS_20201125.asn
 * C:/Users/Administrator/AppData/Local/Temp/2/asn1studio.Administrator.9592/ossSamplePOLICE/J2735_CITS_20201125.asn
 */


package dsrc.dsrc;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type PathPrediction from ASN1 Module DSRC.
 * @see Sequence
 */

public class PathPrediction extends Sequence {
    
    /**
     * The default constructor.
     */
    public PathPrediction()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PathPrediction(RadiusOfCurvature radiusOfCurve, 
		    Confidence confidence)
    {
	setRadiusOfCurve(radiusOfCurve);
	setConfidence(confidence);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RadiusOfCurvature();
	mComponents[1] = new Confidence();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new RadiusOfCurvature();
	    case 1:
		return new Confidence();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "radiusOfCurve"
    public RadiusOfCurvature getRadiusOfCurve()
    {
	return (RadiusOfCurvature)mComponents[0];
    }
    
    public void setRadiusOfCurve(RadiusOfCurvature radiusOfCurve)
    {
	mComponents[0] = radiusOfCurve;
    }
    
    
    // Methods for field "confidence"
    public Confidence getConfidence()
    {
	return (Confidence)mComponents[1];
    }
    
    public void setConfidence(Confidence confidence)
    {
	mComponents[1] = confidence;
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "dsrc.dsrc",
	    "PathPrediction"
	),
	new QName (
	    "DSRC",
	    "PathPrediction"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"RadiusOfCurvature"
			    ),
			    new QName (
				"DSRC",
				"RadiusOfCurvature"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RadiusOfCurvature(-32767), 
				    new RadiusOfCurvature(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32767),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "radiusOfCurve",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Confidence"
			    ),
			    new QName (
				"DSRC",
				"Confidence"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Confidence(0), 
				    new Confidence(200),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(200)
			    ),
			    null
			)
		    ),
		    "confidence",
		    1,
		    2,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PathPrediction object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PathPrediction object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PathPrediction
