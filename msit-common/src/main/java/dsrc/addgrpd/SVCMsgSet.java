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


package dsrc.addgrpd;

import com.oss.asn1.AbstractData;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type SVCMsgSet from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class SVCMsgSet extends Sequence {
    
    /**
     * The default constructor.
     */
    public SVCMsgSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SVCMsgSet(dsrc.dsrc.FurtherInfoID furtherInfoID, 
		    dsrc.dsrc.TemporaryID svcMsgID, 
		    dsrc.dsrc.DDateTime svcMsgDate, MsgDetail svcMsgDetail)
    {
	setFurtherInfoID(furtherInfoID);
	setSvcMsgID(svcMsgID);
	setSvcMsgDate(svcMsgDate);
	setSvcMsgDetail(svcMsgDetail);
    }
    
    public void initComponents()
    {
	mComponents[0] = new dsrc.dsrc.FurtherInfoID();
	mComponents[1] = new dsrc.dsrc.TemporaryID();
	mComponents[2] = new dsrc.dsrc.DDateTime();
	mComponents[3] = new MsgDetail();
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
		return new dsrc.dsrc.FurtherInfoID();
	    case 1:
		return new dsrc.dsrc.TemporaryID();
	    case 2:
		return new dsrc.dsrc.DDateTime();
	    case 3:
		return new MsgDetail();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "furtherInfoID"
    public dsrc.dsrc.FurtherInfoID getFurtherInfoID()
    {
	return (dsrc.dsrc.FurtherInfoID)mComponents[0];
    }
    
    public void setFurtherInfoID(dsrc.dsrc.FurtherInfoID furtherInfoID)
    {
	mComponents[0] = furtherInfoID;
    }
    
    
    // Methods for field "svcMsgID"
    public dsrc.dsrc.TemporaryID getSvcMsgID()
    {
	return (dsrc.dsrc.TemporaryID)mComponents[1];
    }
    
    public void setSvcMsgID(dsrc.dsrc.TemporaryID svcMsgID)
    {
	mComponents[1] = svcMsgID;
    }
    
    
    // Methods for field "svcMsgDate"
    public dsrc.dsrc.DDateTime getSvcMsgDate()
    {
	return (dsrc.dsrc.DDateTime)mComponents[2];
    }
    
    public void setSvcMsgDate(dsrc.dsrc.DDateTime svcMsgDate)
    {
	mComponents[2] = svcMsgDate;
    }
    
    
    // Methods for field "svcMsgDetail"
    public MsgDetail getSvcMsgDetail()
    {
	return (MsgDetail)mComponents[3];
    }
    
    public void setSvcMsgDetail(MsgDetail svcMsgDetail)
    {
	mComponents[3] = svcMsgDetail;
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
	    "dsrc.addgrpd",
	    "SVCMsgSet"
	),
	new QName (
	    "AddGrpD",
	    "SVCMsgSet"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"FurtherInfoID"
			    ),
			    new QName (
				"DSRC",
				"FurtherInfoID"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(2)
				)
			    ),
			    new Bounds (
				Long.valueOf(2),
				Long.valueOf(2)
			    )
			)
		    ),
		    "furtherInfoID",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"TemporaryID"
			    ),
			    new QName (
				"DSRC",
				"TemporaryID"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(4)
				)
			    ),
			    new Bounds (
				Long.valueOf(4),
				Long.valueOf(4)
			    )
			)
		    ),
		    "svcMsgID",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"DDateTime"
			    ),
			    new QName (
				"DSRC",
				"DDateTime"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "DDateTime"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "DDateTime"
				)
			    ),
			    0
			)
		    ),
		    "svcMsgDate",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"MsgDetail"
			    ),
			    new QName (
				"AddGrpD",
				"MsgDetail"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "MsgDetail"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "MsgDetail"
				)
			    ),
			    0
			)
		    ),
		    "svcMsgDetail",
		    3,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SVCMsgSet object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SVCMsgSet object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SVCMsgSet
