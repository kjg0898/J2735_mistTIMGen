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

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type CITSTolgateLaneInfo from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class CITSTolgateLaneInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public CITSTolgateLaneInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CITSTolgateLaneInfo(UTF8String16 name, INTEGER heading, 
		    Lanes lanes)
    {
	setName(name);
	setHeading(heading);
	setLanes(lanes);
    }
    
    /**
     * Construct with components.
     */
    public CITSTolgateLaneInfo(UTF8String16 name, long heading, Lanes lanes)
    {
	this(name, new INTEGER(heading), lanes);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new INTEGER();
	mComponents[2] = new Lanes();
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
		return new UTF8String16();
	    case 1:
		return new INTEGER();
	    case 2:
		return new Lanes();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "name"
    public UTF8String16 getName()
    {
	return (UTF8String16)mComponents[0];
    }
    
    public void setName(UTF8String16 name)
    {
	mComponents[0] = name;
    }
    
    
    // Methods for field "heading"
    public long getHeading()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setHeading(long heading)
    {
	setHeading(new INTEGER(heading));
    }
    
    public void setHeading(INTEGER heading)
    {
	mComponents[1] = heading;
    }
    
    
    // Methods for field "lanes"
    public Lanes getLanes()
    {
	return (Lanes)mComponents[2];
    }
    
    public void setLanes(Lanes lanes)
    {
	mComponents[2] = lanes;
    }
    
    
    
    /**
     * Define the ASN1 Type Lanes from ASN1 Module AddGrpD.
     * @see SequenceOf
     */
    public static class Lanes extends SequenceOf<CITSTolgateLane> {
	
	/**
	 * The default constructor.
	 */
	public Lanes()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Lanes(CITSTolgateLane[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new CITSTolgateLane();
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
		"CITSTolgateLaneInfo$Lanes"
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
			new INTEGER(32),
			0
		    )
		)
	    ),
	    new Bounds (
		Long.valueOf(1),
		Long.valueOf(32)
	    ),
	    new TypeInfoRef (
		new QName (
		    "dsrc.addgrpd",
		    "CITSTolgateLane"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Lanes object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Lanes object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Lanes

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
	    "CITSTolgateLaneInfo"
	),
	new QName (
	    "AddGrpD",
	    "CITSTolgateLaneInfo"
	),
	274450,
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
				"com.oss.asn1",
				"UTF8String16"
			    ),
			    new QName (
				"builtin",
				"UTF8String16"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(32),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "name",
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(1),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(1)
			    ),
			    null
			)
		    ),
		    "heading",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.addgrpd",
			    "CITSTolgateLaneInfo$Lanes"
			)
		    ),
		    "lanes",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CITSTolgateLaneInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSTolgateLaneInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSTolgateLaneInfo
