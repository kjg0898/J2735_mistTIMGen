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
 * Define the ASN1 Type BrakeSystemStatus from ASN1 Module DSRC.
 * @see Sequence
 */

public class BrakeSystemStatus extends Sequence {
    
    /**
     * The default constructor.
     */
    public BrakeSystemStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BrakeSystemStatus(BrakeAppliedStatus wheelBrakes, 
		    TractionControlStatus traction, AntiLockBrakeStatus abs, 
		    StabilityControlStatus scs, BrakeBoostApplied brakeBoost, 
		    AuxiliaryBrakeStatus auxBrakes)
    {
	setWheelBrakes(wheelBrakes);
	setTraction(traction);
	setAbs(abs);
	setScs(scs);
	setBrakeBoost(brakeBoost);
	setAuxBrakes(auxBrakes);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BrakeAppliedStatus();
	mComponents[1] = TractionControlStatus.unavailable;
	mComponents[2] = AntiLockBrakeStatus.unavailable;
	mComponents[3] = StabilityControlStatus.unavailable;
	mComponents[4] = BrakeBoostApplied.unavailable;
	mComponents[5] = AuxiliaryBrakeStatus.unavailable;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BrakeAppliedStatus();
	    case 1:
		return TractionControlStatus.unavailable;
	    case 2:
		return AntiLockBrakeStatus.unavailable;
	    case 3:
		return StabilityControlStatus.unavailable;
	    case 4:
		return BrakeBoostApplied.unavailable;
	    case 5:
		return AuxiliaryBrakeStatus.unavailable;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "wheelBrakes"
    public BrakeAppliedStatus getWheelBrakes()
    {
	return (BrakeAppliedStatus)mComponents[0];
    }
    
    public void setWheelBrakes(BrakeAppliedStatus wheelBrakes)
    {
	mComponents[0] = wheelBrakes;
    }
    
    
    // Methods for field "traction"
    public TractionControlStatus getTraction()
    {
	return (TractionControlStatus)mComponents[1];
    }
    
    public void setTraction(TractionControlStatus traction)
    {
	mComponents[1] = traction;
    }
    
    
    // Methods for field "abs"
    public AntiLockBrakeStatus getAbs()
    {
	return (AntiLockBrakeStatus)mComponents[2];
    }
    
    public void setAbs(AntiLockBrakeStatus abs)
    {
	mComponents[2] = abs;
    }
    
    
    // Methods for field "scs"
    public StabilityControlStatus getScs()
    {
	return (StabilityControlStatus)mComponents[3];
    }
    
    public void setScs(StabilityControlStatus scs)
    {
	mComponents[3] = scs;
    }
    
    
    // Methods for field "brakeBoost"
    public BrakeBoostApplied getBrakeBoost()
    {
	return (BrakeBoostApplied)mComponents[4];
    }
    
    public void setBrakeBoost(BrakeBoostApplied brakeBoost)
    {
	mComponents[4] = brakeBoost;
    }
    
    
    // Methods for field "auxBrakes"
    public AuxiliaryBrakeStatus getAuxBrakes()
    {
	return (AuxiliaryBrakeStatus)mComponents[5];
    }
    
    public void setAuxBrakes(AuxiliaryBrakeStatus auxBrakes)
    {
	mComponents[5] = auxBrakes;
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
	    "BrakeSystemStatus"
	),
	new QName (
	    "DSRC",
	    "BrakeSystemStatus"
	),
	274450,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"BrakeAppliedStatus"
			    ),
			    new QName (
				"DSRC",
				"BrakeAppliedStatus"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(5)
				)
			    ),
			    new Bounds (
				Long.valueOf(5),
				Long.valueOf(5)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"leftFront",
					1
				    ),
				    new MemberListElement (
					"leftRear",
					2
				    ),
				    new MemberListElement (
					"rightFront",
					3
				    ),
				    new MemberListElement (
					"rightRear",
					4
				    )
				}
			    )
			)
		    ),
		    "wheelBrakes",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"TractionControlStatus"
			    ),
			    new QName (
				"DSRC",
				"TractionControlStatus"
			    ),
			    274450,
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
					"on",
					2
				    ),
				    new MemberListElement (
					"engaged",
					3
				    )
				}
			    ),
			    0,
			    TractionControlStatus.unavailable
			)
		    ),
		    "traction",
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
				"AntiLockBrakeStatus"
			    ),
			    new QName (
				"DSRC",
				"AntiLockBrakeStatus"
			    ),
			    274450,
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
					"on",
					2
				    ),
				    new MemberListElement (
					"engaged",
					3
				    )
				}
			    ),
			    0,
			    AntiLockBrakeStatus.unavailable
			)
		    ),
		    "abs",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"StabilityControlStatus"
			    ),
			    new QName (
				"DSRC",
				"StabilityControlStatus"
			    ),
			    274450,
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
					"on",
					2
				    ),
				    new MemberListElement (
					"engaged",
					3
				    )
				}
			    ),
			    0,
			    StabilityControlStatus.unavailable
			)
		    ),
		    "scs",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"BrakeBoostApplied"
			    ),
			    new QName (
				"DSRC",
				"BrakeBoostApplied"
			    ),
			    274450,
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
					"on",
					2
				    )
				}
			    ),
			    0,
			    BrakeBoostApplied.unavailable
			)
		    ),
		    "brakeBoost",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"AuxiliaryBrakeStatus"
			    ),
			    new QName (
				"DSRC",
				"AuxiliaryBrakeStatus"
			    ),
			    274450,
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
					"on",
					2
				    ),
				    new MemberListElement (
					"reserved",
					3
				    )
				}
			    ),
			    0,
			    AuxiliaryBrakeStatus.unavailable
			)
		    ),
		    "auxBrakes",
		    5,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' BrakeSystemStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BrakeSystemStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for BrakeSystemStatus
