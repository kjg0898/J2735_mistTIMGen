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
import com.oss.asn1.Choice;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type ApproachOrLane from ASN1 Module DSRC.
 * @see Choice
 */

public class ApproachOrLane extends Choice {
    
    /**
     * The default constructor.
     */
    public ApproachOrLane()
    {
    }
    
    public static final  int  approach_chosen = 1;
    public static final  int  lane_chosen = 2;
    
    // Methods for field "approach"
    public static ApproachOrLane createApproachOrLaneWithApproach(long approach)
    {
	return createApproachOrLaneWithApproach(new ApproachID(approach));
    }
    
    public static ApproachOrLane createApproachOrLaneWithApproach(ApproachID approach)
    {
	ApproachOrLane __object = new ApproachOrLane();

	__object.setApproach(approach);
	return __object;
    }
    
    public boolean hasApproach()
    {
	return getChosenFlag() == approach_chosen;
    }
    
    public ApproachID getApproach()
    {
	if (hasApproach())
	    return (ApproachID)mChosenValue;
	else
	    return null;
    }
    
    public void setApproach(long approach)
    {
	setApproach(new ApproachID(approach));
    }
    
    public void setApproach(ApproachID approach)
    {
	setChosenValue(approach);
	setChosenFlag(approach_chosen);
    }
    
    
    // Methods for field "lane"
    public static ApproachOrLane createApproachOrLaneWithLane(long lane)
    {
	return createApproachOrLaneWithLane(new LaneID(lane));
    }
    
    public static ApproachOrLane createApproachOrLaneWithLane(LaneID lane)
    {
	ApproachOrLane __object = new ApproachOrLane();

	__object.setLane(lane);
	return __object;
    }
    
    public boolean hasLane()
    {
	return getChosenFlag() == lane_chosen;
    }
    
    public LaneID getLane()
    {
	if (hasLane())
	    return (LaneID)mChosenValue;
	else
	    return null;
    }
    
    public void setLane(long lane)
    {
	setLane(new LaneID(lane));
    }
    
    public void setLane(LaneID lane)
    {
	setChosenValue(lane);
	setChosenFlag(lane_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case approach_chosen:
		return new ApproachID();
	    case lane_chosen:
		return new LaneID();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "dsrc.dsrc",
	    "ApproachOrLane"
	),
	new QName (
	    "DSRC",
	    "ApproachOrLane"
	),
	274450,
	null,
	new FieldsDict (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"ApproachID"
			    ),
			    new QName (
				"DSRC",
				"ApproachID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ApproachID(0), 
				    new ApproachID(15),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(15)
			    ),
			    null
			)
		    ),
		    "approach",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"LaneID"
			    ),
			    new QName (
				"DSRC",
				"LaneID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new LaneID(0), 
				    new LaneID(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "lane",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ApproachOrLane object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ApproachOrLane object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ApproachOrLane
