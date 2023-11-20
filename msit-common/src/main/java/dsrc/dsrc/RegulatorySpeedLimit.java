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
 * Define the ASN1 Type RegulatorySpeedLimit from ASN1 Module DSRC.
 * @see Sequence
 */

public class RegulatorySpeedLimit extends Sequence {
    
    /**
     * The default constructor.
     */
    public RegulatorySpeedLimit()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RegulatorySpeedLimit(SpeedLimitType type, Velocity speed)
    {
	setType(type);
	setSpeed(speed);
    }
    
    public void initComponents()
    {
	mComponents[0] = SpeedLimitType.unknown;
	mComponents[1] = new Velocity();
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
		return SpeedLimitType.unknown;
	    case 1:
		return new Velocity();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "type"
    public SpeedLimitType getType()
    {
	return (SpeedLimitType)mComponents[0];
    }
    
    public void setType(SpeedLimitType type)
    {
	mComponents[0] = type;
    }
    
    
    // Methods for field "speed"
    public Velocity getSpeed()
    {
	return (Velocity)mComponents[1];
    }
    
    public void setSpeed(Velocity speed)
    {
	mComponents[1] = speed;
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
	    "RegulatorySpeedLimit"
	),
	new QName (
	    "DSRC",
	    "RegulatorySpeedLimit"
	),
	274450,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"SpeedLimitType"
			    ),
			    new QName (
				"DSRC",
				"SpeedLimitType"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unknown",
					0
				    ),
				    new MemberListElement (
					"maxSpeedInSchoolZone",
					1
				    ),
				    new MemberListElement (
					"maxSpeedInSchoolZoneWhenChildrenArePresent",
					2
				    ),
				    new MemberListElement (
					"maxSpeedInConstructionZone",
					3
				    ),
				    new MemberListElement (
					"vehicleMinSpeed",
					4
				    ),
				    new MemberListElement (
					"vehicleMaxSpeed",
					5
				    ),
				    new MemberListElement (
					"vehicleNightMaxSpeed",
					6
				    ),
				    new MemberListElement (
					"truckMinSpeed",
					7
				    ),
				    new MemberListElement (
					"truckMaxSpeed",
					8
				    ),
				    new MemberListElement (
					"truckNightMaxSpeed",
					9
				    ),
				    new MemberListElement (
					"vehiclesWithTrailersMinSpeed",
					10
				    ),
				    new MemberListElement (
					"vehiclesWithTrailersMaxSpeed",
					11
				    ),
				    new MemberListElement (
					"vehiclesWithTrailersNightMaxSpeed",
					12
				    )
				}
			    ),
			    0,
			    SpeedLimitType.unknown
			)
		    ),
		    "type",
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
				"Velocity"
			    ),
			    new QName (
				"DSRC",
				"Velocity"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Velocity(0), 
				    new Velocity(8191),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(8191)
			    ),
			    null
			)
		    ),
		    "speed",
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
     * Get the type descriptor (TypeInfo) of 'this' RegulatorySpeedLimit object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RegulatorySpeedLimit object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RegulatorySpeedLimit
