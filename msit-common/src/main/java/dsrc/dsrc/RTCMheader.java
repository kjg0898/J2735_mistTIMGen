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
 * Define the ASN1 Type RTCMheader from ASN1 Module DSRC.
 * @see Sequence
 */

public class RTCMheader extends Sequence {
    
    /**
     * The default constructor.
     */
    public RTCMheader()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RTCMheader(GNSSstatus status, AntennaOffsetSet offsetSet)
    {
	setStatus(status);
	setOffsetSet(offsetSet);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GNSSstatus();
	mComponents[1] = new AntennaOffsetSet();
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
		return new GNSSstatus();
	    case 1:
		return new AntennaOffsetSet();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "status"
    public GNSSstatus getStatus()
    {
	return (GNSSstatus)mComponents[0];
    }
    
    public void setStatus(GNSSstatus status)
    {
	mComponents[0] = status;
    }
    
    
    // Methods for field "offsetSet"
    public AntennaOffsetSet getOffsetSet()
    {
	return (AntennaOffsetSet)mComponents[1];
    }
    
    public void setOffsetSet(AntennaOffsetSet offsetSet)
    {
	mComponents[1] = offsetSet;
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
	    "RTCMheader"
	),
	new QName (
	    "DSRC",
	    "RTCMheader"
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
				"GNSSstatus"
			    ),
			    new QName (
				"DSRC",
				"GNSSstatus"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(8)
				)
			    ),
			    new Bounds (
				Long.valueOf(8),
				Long.valueOf(8)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"isHealthy",
					1
				    ),
				    new MemberListElement (
					"isMonitored",
					2
				    ),
				    new MemberListElement (
					"baseStationType",
					3
				    ),
				    new MemberListElement (
					"aPDOPofUnder5",
					4
				    ),
				    new MemberListElement (
					"inViewOfUnder5",
					5
				    ),
				    new MemberListElement (
					"localCorrectionsPresent",
					6
				    ),
				    new MemberListElement (
					"networkCorrectionsPresent",
					7
				    )
				}
			    )
			)
		    ),
		    "status",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"AntennaOffsetSet"
			    ),
			    new QName (
				"DSRC",
				"AntennaOffsetSet"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "AntennaOffsetSet"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "AntennaOffsetSet"
				)
			    ),
			    0
			)
		    ),
		    "offsetSet",
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
     * Get the type descriptor (TypeInfo) of 'this' RTCMheader object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RTCMheader object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RTCMheader
