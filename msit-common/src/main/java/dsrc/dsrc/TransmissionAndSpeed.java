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
 * Define the ASN1 Type TransmissionAndSpeed from ASN1 Module DSRC.
 * @see Sequence
 */

public class TransmissionAndSpeed extends Sequence {
    
    /**
     * The default constructor.
     */
    public TransmissionAndSpeed()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TransmissionAndSpeed(TransmissionState transmisson, Velocity speed)
    {
	setTransmisson(transmisson);
	setSpeed(speed);
    }
    
    public void initComponents()
    {
	mComponents[0] = TransmissionState.neutral;
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
		return TransmissionState.neutral;
	    case 1:
		return new Velocity();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "transmisson"
    public TransmissionState getTransmisson()
    {
	return (TransmissionState)mComponents[0];
    }
    
    public void setTransmisson(TransmissionState transmisson)
    {
	mComponents[0] = transmisson;
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
	    "TransmissionAndSpeed"
	),
	new QName (
	    "DSRC",
	    "TransmissionAndSpeed"
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
				"TransmissionState"
			    ),
			    new QName (
				"DSRC",
				"TransmissionState"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"neutral",
					0
				    ),
				    new MemberListElement (
					"park",
					1
				    ),
				    new MemberListElement (
					"forwardGears",
					2
				    ),
				    new MemberListElement (
					"reverseGears",
					3
				    ),
				    new MemberListElement (
					"reserved1",
					4
				    ),
				    new MemberListElement (
					"reserved2",
					5
				    ),
				    new MemberListElement (
					"reserved3",
					6
				    ),
				    new MemberListElement (
					"unavailable",
					7
				    )
				}
			    ),
			    0,
			    TransmissionState.neutral
			)
		    ),
		    "transmisson",
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
     * Get the type descriptor (TypeInfo) of 'this' TransmissionAndSpeed object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TransmissionAndSpeed object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TransmissionAndSpeed
