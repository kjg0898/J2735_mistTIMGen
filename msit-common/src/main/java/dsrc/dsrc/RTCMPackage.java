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
 * Define the ASN1 Type RTCMPackage from ASN1 Module DSRC.
 * @see Sequence
 */

public class RTCMPackage extends Sequence {
    
    /**
     * The default constructor.
     */
    public RTCMPackage()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RTCMPackage(RTCMheader rtcmHeader, RTCMmessageList msgs)
    {
	setRtcmHeader(rtcmHeader);
	setMsgs(msgs);
    }
    
    /**
     * Construct with required components.
     */
    public RTCMPackage(RTCMmessageList msgs)
    {
	setMsgs(msgs);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RTCMheader();
	mComponents[1] = new RTCMmessageList();
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
		return new RTCMheader();
	    case 1:
		return new RTCMmessageList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rtcmHeader"
    public RTCMheader getRtcmHeader()
    {
	return (RTCMheader)mComponents[0];
    }
    
    public void setRtcmHeader(RTCMheader rtcmHeader)
    {
	mComponents[0] = rtcmHeader;
    }
    
    public boolean hasRtcmHeader()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRtcmHeader()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "msgs"
    public RTCMmessageList getMsgs()
    {
	return (RTCMmessageList)mComponents[1];
    }
    
    public void setMsgs(RTCMmessageList msgs)
    {
	mComponents[1] = msgs;
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
	    "RTCMPackage"
	),
	new QName (
	    "DSRC",
	    "RTCMPackage"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "RTCMheader"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "RTCMheader"
				)
			    ),
			    0
			)
		    ),
		    "rtcmHeader",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"RTCMmessageList"
			    ),
			    new QName (
				"DSRC",
				"RTCMmessageList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(5),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(5)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "RTCMmessage"
				)
			    )
			)
		    ),
		    "msgs",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' RTCMPackage object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RTCMPackage object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RTCMPackage
