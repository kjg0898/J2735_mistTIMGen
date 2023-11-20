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
 * Define the ASN1 Type IntersectionAccessPoint from ASN1 Module DSRC.
 * @see Choice
 */

public class IntersectionAccessPoint extends Choice {
    
    /**
     * The default constructor.
     */
    public IntersectionAccessPoint()
    {
    }
    
    public static final  int  lane_chosen = 1;
    public static final  int  approach_chosen = 2;
    public static final  int  connection_chosen = 3;
    
    // Methods for field "lane"
    public static IntersectionAccessPoint createIntersectionAccessPointWithLane(long lane)
    {
	return createIntersectionAccessPointWithLane(new LaneID(lane));
    }
    
    public static IntersectionAccessPoint createIntersectionAccessPointWithLane(LaneID lane)
    {
	IntersectionAccessPoint __object = new IntersectionAccessPoint();

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
    
    
    // Methods for field "approach"
    public static IntersectionAccessPoint createIntersectionAccessPointWithApproach(long approach)
    {
	return createIntersectionAccessPointWithApproach(new ApproachID(approach));
    }
    
    public static IntersectionAccessPoint createIntersectionAccessPointWithApproach(ApproachID approach)
    {
	IntersectionAccessPoint __object = new IntersectionAccessPoint();

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
    
    
    // Methods for field "connection"
    public static IntersectionAccessPoint createIntersectionAccessPointWithConnection(long connection)
    {
	return createIntersectionAccessPointWithConnection(new LaneConnectionID(connection));
    }
    
    public static IntersectionAccessPoint createIntersectionAccessPointWithConnection(LaneConnectionID connection)
    {
	IntersectionAccessPoint __object = new IntersectionAccessPoint();

	__object.setConnection(connection);
	return __object;
    }
    
    public boolean hasConnection()
    {
	return getChosenFlag() == connection_chosen;
    }
    
    public LaneConnectionID getConnection()
    {
	if (hasConnection())
	    return (LaneConnectionID)mChosenValue;
	else
	    return null;
    }
    
    public void setConnection(long connection)
    {
	setConnection(new LaneConnectionID(connection));
    }
    
    public void setConnection(LaneConnectionID connection)
    {
	setChosenValue(connection);
	setChosenFlag(connection_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case lane_chosen:
		return new LaneID();
	    case approach_chosen:
		return new ApproachID();
	    case connection_chosen:
		return new LaneConnectionID();
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
	    "IntersectionAccessPoint"
	),
	new QName (
	    "DSRC",
	    "IntersectionAccessPoint"
	),
	274454,
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
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"LaneConnectionID"
			    ),
			    new QName (
				"DSRC",
				"LaneConnectionID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new LaneConnectionID(0), 
				    new LaneConnectionID(255),
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
		    "connection",
		    2,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IntersectionAccessPoint object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntersectionAccessPoint object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Check the current selection on unknown extension
     */
    public final boolean hasUnknownExtension()
    {
	return getChosenFlag() > 3;
    }
    
} // End class definition for IntersectionAccessPoint
