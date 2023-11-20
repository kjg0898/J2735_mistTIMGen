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
import com.oss.asn1.UTF8String16;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type CITSStationDetail from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class CITSStationDetail extends Sequence {
    
    /**
     * The default constructor.
     */
    public CITSStationDetail()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CITSStationDetail(UTF8String16 name, INTEGER capacity, 
		    INTEGER value)
    {
	setName(name);
	setCapacity(capacity);
	setValue(value);
    }
    
    /**
     * Construct with components.
     */
    public CITSStationDetail(UTF8String16 name, long capacity, long value)
    {
	this(name, new INTEGER(capacity), new INTEGER(value));
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
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
		return new INTEGER();
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
    
    public boolean hasName()
    {
	return componentIsPresent(0);
    }
    
    public void deleteName()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "capacity"
    public long getCapacity()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setCapacity(long capacity)
    {
	setCapacity(new INTEGER(capacity));
    }
    
    public void setCapacity(INTEGER capacity)
    {
	mComponents[1] = capacity;
    }
    
    public boolean hasCapacity()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCapacity()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "value"
    public long getValue()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setValue(long value)
    {
	setValue(new INTEGER(value));
    }
    
    public void setValue(INTEGER value)
    {
	mComponents[2] = value;
    }
    
    public boolean hasValue()
    {
	return componentIsPresent(2);
    }
    
    public void deleteValue()
    {
	setComponentAbsent(2);
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
	    "CITSStationDetail"
	),
	new QName (
	    "AddGrpD",
	    "CITSStationDetail"
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
		    3,
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
				    new INTEGER(65535),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(65535)
			    ),
			    null
			)
		    ),
		    "capacity",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
				    new INTEGER(65535),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(65535)
			    ),
			    null
			)
		    ),
		    "value",
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
     * Get the type descriptor (TypeInfo) of 'this' CITSStationDetail object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSStationDetail object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSStationDetail
