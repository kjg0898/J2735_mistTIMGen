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
 * Define the ASN1 Type PrivilegedEvents from ASN1 Module DSRC.
 * @see Sequence
 */

public class PrivilegedEvents extends Sequence {
    
    /**
     * The default constructor.
     */
    public PrivilegedEvents()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PrivilegedEvents(SSPindex sspRights, PrivilegedEventFlags event)
    {
	setSspRights(sspRights);
	setEvent(event);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SSPindex();
	mComponents[1] = new PrivilegedEventFlags();
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
		return new SSPindex();
	    case 1:
		return new PrivilegedEventFlags();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sspRights"
    public SSPindex getSspRights()
    {
	return (SSPindex)mComponents[0];
    }
    
    public void setSspRights(SSPindex sspRights)
    {
	mComponents[0] = sspRights;
    }
    
    
    // Methods for field "event"
    public PrivilegedEventFlags getEvent()
    {
	return (PrivilegedEventFlags)mComponents[1];
    }
    
    public void setEvent(PrivilegedEventFlags event)
    {
	mComponents[1] = event;
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
	    "PrivilegedEvents"
	),
	new QName (
	    "DSRC",
	    "PrivilegedEvents"
	),
	274454,
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
				"SSPindex"
			    ),
			    new QName (
				"DSRC",
				"SSPindex"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SSPindex(0), 
				    new SSPindex(31),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(31)
			    ),
			    null
			)
		    ),
		    "sspRights",
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
				"PrivilegedEventFlags"
			    ),
			    new QName (
				"DSRC",
				"PrivilegedEventFlags"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(16)
				)
			    ),
			    new Bounds (
				Long.valueOf(16),
				Long.valueOf(16)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"peUnavailable",
					0
				    ),
				    new MemberListElement (
					"peEmergencyResponse",
					1
				    ),
				    new MemberListElement (
					"peEmergencyLightsActive",
					2
				    ),
				    new MemberListElement (
					"peEmergencySoundActive",
					3
				    ),
				    new MemberListElement (
					"peNonEmergencyLightsActive",
					4
				    ),
				    new MemberListElement (
					"peNonEmergencySoundActive",
					5
				    )
				}
			    )
			)
		    ),
		    "event",
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
     * Get the type descriptor (TypeInfo) of 'this' PrivilegedEvents object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PrivilegedEvents object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PrivilegedEvents
