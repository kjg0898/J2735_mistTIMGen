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


package dsrc.addgrpc;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Altitude from ASN1 Module AddGrpC.
 * @see Sequence
 */

public class Altitude extends Sequence {
    
    /**
     * The default constructor.
     */
    public Altitude()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Altitude(AltitudeValue value, AltitudeConfidence confidence)
    {
	setValue(value);
	setConfidence(confidence);
    }
    
    public void initComponents()
    {
	mComponents[0] = new AltitudeValue();
	mComponents[1] = AltitudeConfidence.alt_000_01;
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
		return new AltitudeValue();
	    case 1:
		return AltitudeConfidence.alt_000_01;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "value"
    public AltitudeValue getValue()
    {
	return (AltitudeValue)mComponents[0];
    }
    
    public void setValue(AltitudeValue value)
    {
	mComponents[0] = value;
    }
    
    
    // Methods for field "confidence"
    public AltitudeConfidence getConfidence()
    {
	return (AltitudeConfidence)mComponents[1];
    }
    
    public void setConfidence(AltitudeConfidence confidence)
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
	    "dsrc.addgrpc",
	    "Altitude"
	),
	new QName (
	    "AddGrpC",
	    "Altitude"
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
				"dsrc.addgrpc",
				"AltitudeValue"
			    ),
			    new QName (
				"AddGrpC",
				"AltitudeValue"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new AltitudeValue(-100000), 
				    new AltitudeValue(800001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-100000),
				Long.valueOf(800001)
			    ),
			    null
			)
		    ),
		    "value",
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
				"dsrc.addgrpc",
				"AltitudeConfidence"
			    ),
			    new QName (
				"AddGrpC",
				"AltitudeConfidence"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"alt-000-01",
					0
				    ),
				    new MemberListElement (
					"alt-000-02",
					1
				    ),
				    new MemberListElement (
					"alt-000-05",
					2
				    ),
				    new MemberListElement (
					"alt-000-10",
					3
				    ),
				    new MemberListElement (
					"alt-000-20",
					4
				    ),
				    new MemberListElement (
					"alt-000-50",
					5
				    ),
				    new MemberListElement (
					"alt-001-00",
					6
				    ),
				    new MemberListElement (
					"alt-002-00",
					7
				    ),
				    new MemberListElement (
					"alt-005-00",
					8
				    ),
				    new MemberListElement (
					"alt-010-00",
					9
				    ),
				    new MemberListElement (
					"alt-020-00",
					10
				    ),
				    new MemberListElement (
					"alt-050-00",
					11
				    ),
				    new MemberListElement (
					"alt-100-00",
					12
				    ),
				    new MemberListElement (
					"alt-200-00",
					13
				    ),
				    new MemberListElement (
					"outOfRange",
					14
				    ),
				    new MemberListElement (
					"unavailable",
					15
				    )
				}
			    ),
			    0,
			    AltitudeConfidence.alt_000_01
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
     * Get the type descriptor (TypeInfo) of 'this' Altitude object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Altitude object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Altitude
