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
import com.oss.asn1.OpenType;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type MessageFrame from ASN1 Module DSRC.
 * @see Sequence
 */

public class MessageFrame extends Sequence {
    
    /**
     * The default constructor.
     */
    public MessageFrame()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MessageFrame(DSRCmsgID messageId, OpenType value)
    {
	setMessageId(messageId);
	setValue(value);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DSRCmsgID();
	mComponents[1] = new OpenType();
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
		return new DSRCmsgID();
	    case 1:
		return new OpenType();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "messageId"
    public DSRCmsgID getMessageId()
    {
	return (DSRCmsgID)mComponents[0];
    }
    
    public void setMessageId(DSRCmsgID messageId)
    {
	mComponents[0] = messageId;
    }
    
    
    // Methods for field "value"
    public OpenType getValue()
    {
	return (OpenType)mComponents[1];
    }
    
    public void setValue(OpenType value)
    {
	mComponents[1] = value;
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
	    "MessageFrame"
	),
	new QName (
	    "DSRC",
	    "MessageFrame"
	),
	274966,
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
				"DSRCmsgID"
			    ),
			    new QName (
				"DSRC",
				"DSRCmsgID"
			    ),
			    274450,
			    new Intersection (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new DSRCmsgID(0), 
					new DSRCmsgID(32767),
					0
				    )
				),
				new TableConstraint (
				    DSRC.messageTypes,
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "messageId",
		    0,
		    274,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new OpenTypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"OpenType"
			    ),
			    new QName (
				"builtin",
				"OpenType"
			    ),
			    1323026,
			    new ComponentRelationConstraint (
				new TableConstraint (
				    DSRC.messageTypes,
				    1
				),
				new ComponentRelations (
				    new ComponentRelation[] {
					new ComponentRelation (
					    0,
					    new FieldInfoRef (
						new QName (
						    "dsrc.dsrc",
						    "MessageFrame"
						),
						0
					    ),
					    0
					)
				    }
				)
			    ),
			    new ComponentRelationConstraint (
				new TableConstraint (
				    DSRC.messageTypes,
				    1
				),
				new ComponentRelations (
				    new ComponentRelation[] {
					new ComponentRelation (
					    0,
					    new FieldInfoRef (
						new QName (
						    "dsrc.dsrc",
						    "MessageFrame"
						),
						0
					    ),
					    0
					)
				    }
				)
			    )
			)
		    ),
		    "value",
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
     * Get the type descriptor (TypeInfo) of 'this' MessageFrame object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MessageFrame object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for MessageFrame
