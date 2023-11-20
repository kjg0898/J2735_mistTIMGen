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
 * Define the ASN1 Type WiperSet from ASN1 Module DSRC.
 * @see Sequence
 */

public class WiperSet extends Sequence {
    
    /**
     * The default constructor.
     */
    public WiperSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public WiperSet(WiperStatus statusFront, WiperRate rateFront, 
		    WiperStatus statusRear, WiperRate rateRear)
    {
	setStatusFront(statusFront);
	setRateFront(rateFront);
	setStatusRear(statusRear);
	setRateRear(rateRear);
    }
    
    /**
     * Construct with required components.
     */
    public WiperSet(WiperStatus statusFront, WiperRate rateFront)
    {
	setStatusFront(statusFront);
	setRateFront(rateFront);
    }
    
    public void initComponents()
    {
	mComponents[0] = WiperStatus.unavailable;
	mComponents[1] = new WiperRate();
	mComponents[2] = WiperStatus.unavailable;
	mComponents[3] = new WiperRate();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return WiperStatus.unavailable;
	    case 1:
		return new WiperRate();
	    case 2:
		return WiperStatus.unavailable;
	    case 3:
		return new WiperRate();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "statusFront"
    public WiperStatus getStatusFront()
    {
	return (WiperStatus)mComponents[0];
    }
    
    public void setStatusFront(WiperStatus statusFront)
    {
	mComponents[0] = statusFront;
    }
    
    
    // Methods for field "rateFront"
    public WiperRate getRateFront()
    {
	return (WiperRate)mComponents[1];
    }
    
    public void setRateFront(WiperRate rateFront)
    {
	mComponents[1] = rateFront;
    }
    
    
    // Methods for field "statusRear"
    public WiperStatus getStatusRear()
    {
	return (WiperStatus)mComponents[2];
    }
    
    public void setStatusRear(WiperStatus statusRear)
    {
	mComponents[2] = statusRear;
    }
    
    public boolean hasStatusRear()
    {
	return componentIsPresent(2);
    }
    
    public void deleteStatusRear()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "rateRear"
    public WiperRate getRateRear()
    {
	return (WiperRate)mComponents[3];
    }
    
    public void setRateRear(WiperRate rateRear)
    {
	mComponents[3] = rateRear;
    }
    
    public boolean hasRateRear()
    {
	return componentIsPresent(3);
    }
    
    public void deleteRateRear()
    {
	setComponentAbsent(3);
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
	    "WiperSet"
	),
	new QName (
	    "DSRC",
	    "WiperSet"
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
				"WiperStatus"
			    ),
			    new QName (
				"DSRC",
				"WiperStatus"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"off",
					1
				    ),
				    new MemberListElement (
					"intermittent",
					2
				    ),
				    new MemberListElement (
					"low",
					3
				    ),
				    new MemberListElement (
					"high",
					4
				    ),
				    new MemberListElement (
					"washerInUse",
					5
				    ),
				    new MemberListElement (
					"automaticPresent",
					6
				    )
				}
			    ),
			    0,
			    WiperStatus.unavailable
			)
		    ),
		    "statusFront",
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
				"WiperRate"
			    ),
			    new QName (
				"DSRC",
				"WiperRate"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new WiperRate(0), 
				    new WiperRate(127),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(127)
			    ),
			    null
			)
		    ),
		    "rateFront",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"WiperStatus"
			    ),
			    new QName (
				"DSRC",
				"WiperStatus"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"off",
					1
				    ),
				    new MemberListElement (
					"intermittent",
					2
				    ),
				    new MemberListElement (
					"low",
					3
				    ),
				    new MemberListElement (
					"high",
					4
				    ),
				    new MemberListElement (
					"washerInUse",
					5
				    ),
				    new MemberListElement (
					"automaticPresent",
					6
				    )
				}
			    ),
			    0,
			    WiperStatus.unavailable
			)
		    ),
		    "statusRear",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"WiperRate"
			    ),
			    new QName (
				"DSRC",
				"WiperRate"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new WiperRate(0), 
				    new WiperRate(127),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(127)
			    ),
			    null
			)
		    ),
		    "rateRear",
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' WiperSet object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' WiperSet object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for WiperSet
