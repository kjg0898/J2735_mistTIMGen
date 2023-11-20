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
import com.oss.asn1.SequenceOf;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type CITSSVCLog from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class CITSSVCLog extends Sequence {
    
    /**
     * The default constructor.
     */
    public CITSSVCLog()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CITSSVCLog(MsgRcvCount rMsgCnt, SvcMsg svcMsg, DispMsg dispMsg)
    {
	setRMsgCnt(rMsgCnt);
	setSvcMsg(svcMsg);
	setDispMsg(dispMsg);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MsgRcvCount();
	mComponents[1] = new SvcMsg();
	mComponents[2] = new DispMsg();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new MsgRcvCount();
	    case 1:
		return new SvcMsg();
	    case 2:
		return new DispMsg();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rMsgCnt"
    public MsgRcvCount getRMsgCnt()
    {
	return (MsgRcvCount)mComponents[0];
    }
    
    public void setRMsgCnt(MsgRcvCount rMsgCnt)
    {
	mComponents[0] = rMsgCnt;
    }
    
    public boolean hasRMsgCnt()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRMsgCnt()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "svcMsg"
    public SvcMsg getSvcMsg()
    {
	return (SvcMsg)mComponents[1];
    }
    
    public void setSvcMsg(SvcMsg svcMsg)
    {
	mComponents[1] = svcMsg;
    }
    
    public boolean hasSvcMsg()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSvcMsg()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type SvcMsg from ASN1 Module AddGrpD.
     * @see SequenceOf
     */
    public static class SvcMsg extends SequenceOf<SVCMsgSet> {
	
	/**
	 * The default constructor.
	 */
	public SvcMsg()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public SvcMsg(SVCMsgSet[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new SVCMsgSet();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"dsrc.addgrpd",
		"CITSSVCLog$SvcMsg"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    274450,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new INTEGER(1),
			new INTEGER(30),
			0
		    )
		)
	    ),
	    new Bounds (
		Long.valueOf(1),
		Long.valueOf(30)
	    ),
	    new TypeInfoRef (
		new QName (
		    "dsrc.addgrpd",
		    "SVCMsgSet"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SvcMsg object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SvcMsg object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SvcMsg

    // Methods for field "dispMsg"
    public DispMsg getDispMsg()
    {
	return (DispMsg)mComponents[2];
    }
    
    public void setDispMsg(DispMsg dispMsg)
    {
	mComponents[2] = dispMsg;
    }
    
    public boolean hasDispMsg()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDispMsg()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type DispMsg from ASN1 Module AddGrpD.
     * @see SequenceOf
     */
    public static class DispMsg extends SequenceOf<DispMsgSet> {
	
	/**
	 * The default constructor.
	 */
	public DispMsg()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public DispMsg(DispMsgSet[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new DispMsgSet();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"dsrc.addgrpd",
		"CITSSVCLog$DispMsg"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    274450,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new INTEGER(1),
			new INTEGER(10),
			0
		    )
		)
	    ),
	    new Bounds (
		Long.valueOf(1),
		Long.valueOf(10)
	    ),
	    new TypeInfoRef (
		new QName (
		    "dsrc.addgrpd",
		    "DispMsgSet"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DispMsg object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DispMsg object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for DispMsg

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
	    "CITSSVCLog"
	),
	new QName (
	    "AddGrpD",
	    "CITSSVCLog"
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
				"dsrc.addgrpd",
				"MsgRcvCount"
			    ),
			    new QName (
				"AddGrpD",
				"MsgRcvCount"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "MsgRcvCount"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "MsgRcvCount"
				)
			    ),
			    0
			)
		    ),
		    "rMsgCnt",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.addgrpd",
			    "CITSSVCLog$SvcMsg"
			)
		    ),
		    "svcMsg",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.addgrpd",
			    "CITSSVCLog$DispMsg"
			)
		    ),
		    "dispMsg",
		    2,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CITSSVCLog object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSSVCLog object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSSVCLog
