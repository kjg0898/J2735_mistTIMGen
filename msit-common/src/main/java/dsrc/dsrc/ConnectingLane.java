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
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type ConnectingLane from ASN1 Module DSRC.
 * @see Sequence
 */

public class ConnectingLane extends Sequence {
    
    /**
     * The default constructor.
     */
    public ConnectingLane()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ConnectingLane(LaneID lane, AllowedManeuvers maneuver)
    {
	setLane(lane);
	setManeuver(maneuver);
    }
    
    /**
     * Construct with required components.
     */
    public ConnectingLane(LaneID lane)
    {
	setLane(lane);
    }
    
    public void initComponents()
    {
	mComponents[0] = new LaneID();
	mComponents[1] = new AllowedManeuvers();
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
		return new LaneID();
	    case 1:
		return new AllowedManeuvers();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "lane"
    public LaneID getLane()
    {
	return (LaneID)mComponents[0];
    }
    
    public void setLane(LaneID lane)
    {
	mComponents[0] = lane;
    }
    
    
    // Methods for field "maneuver"
    public AllowedManeuvers getManeuver()
    {
	return (AllowedManeuvers)mComponents[1];
    }
    
    public void setManeuver(AllowedManeuvers maneuver)
    {
	mComponents[1] = maneuver;
    }
    
    public boolean hasManeuver()
    {
	return componentIsPresent(1);
    }
    
    public void deleteManeuver()
    {
	setComponentAbsent(1);
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
	    "ConnectingLane"
	),
	new QName (
	    "DSRC",
	    "ConnectingLane"
	),
	274450,
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
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"AllowedManeuvers"
			    ),
			    new QName (
				"DSRC",
				"AllowedManeuvers"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(12)
				)
			    ),
			    new Bounds (
				Long.valueOf(12),
				Long.valueOf(12)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"maneuverStraightAllowed",
					0
				    ),
				    new MemberListElement (
					"maneuverLeftAllowed",
					1
				    ),
				    new MemberListElement (
					"maneuverRightAllowed",
					2
				    ),
				    new MemberListElement (
					"maneuverUTurnAllowed",
					3
				    ),
				    new MemberListElement (
					"maneuverLeftTurnOnRedAllowed",
					4
				    ),
				    new MemberListElement (
					"maneuverRightTurnOnRedAllowed",
					5
				    ),
				    new MemberListElement (
					"maneuverLaneChangeAllowed",
					6
				    ),
				    new MemberListElement (
					"maneuverNoStoppingAllowed",
					7
				    ),
				    new MemberListElement (
					"yieldAllwaysRequired",
					8
				    ),
				    new MemberListElement (
					"goWithHalt",
					9
				    ),
				    new MemberListElement (
					"caution",
					10
				    ),
				    new MemberListElement (
					"reserved1",
					11
				    )
				}
			    )
			)
		    ),
		    "maneuver",
		    1,
		    3,
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
     * Get the type descriptor (TypeInfo) of 'this' ConnectingLane object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ConnectingLane object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ConnectingLane
