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
 * Define the ASN1 Type CITSVehicleValue from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class CITSVehicleValue extends Sequence {
    
    /**
     * The default constructor.
     */
    public CITSVehicleValue()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CITSVehicleValue(INTEGER rpm, INTEGER gears, INTEGER mileage, 
		    INTEGER percent, INTEGER liter)
    {
	setRpm(rpm);
	setGears(gears);
	setMileage(mileage);
	setPercent(percent);
	setLiter(liter);
    }
    
    /**
     * Construct with components.
     */
    public CITSVehicleValue(long rpm, long gears, long mileage, long percent, 
		    long liter)
    {
	this(new INTEGER(rpm), new INTEGER(gears), new INTEGER(mileage), 
	     new INTEGER(percent), new INTEGER(liter));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rpm"
    public long getRpm()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setRpm(long rpm)
    {
	setRpm(new INTEGER(rpm));
    }
    
    public void setRpm(INTEGER rpm)
    {
	mComponents[0] = rpm;
    }
    
    public boolean hasRpm()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRpm()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "gears"
    public long getGears()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setGears(long gears)
    {
	setGears(new INTEGER(gears));
    }
    
    public void setGears(INTEGER gears)
    {
	mComponents[1] = gears;
    }
    
    public boolean hasGears()
    {
	return componentIsPresent(1);
    }
    
    public void deleteGears()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "mileage"
    public long getMileage()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setMileage(long mileage)
    {
	setMileage(new INTEGER(mileage));
    }
    
    public void setMileage(INTEGER mileage)
    {
	mComponents[2] = mileage;
    }
    
    public boolean hasMileage()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMileage()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "percent"
    public long getPercent()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setPercent(long percent)
    {
	setPercent(new INTEGER(percent));
    }
    
    public void setPercent(INTEGER percent)
    {
	mComponents[3] = percent;
    }
    
    public boolean hasPercent()
    {
	return componentIsPresent(3);
    }
    
    public void deletePercent()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "liter"
    public long getLiter()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setLiter(long liter)
    {
	setLiter(new INTEGER(liter));
    }
    
    public void setLiter(INTEGER liter)
    {
	mComponents[4] = liter;
    }
    
    public boolean hasLiter()
    {
	return componentIsPresent(4);
    }
    
    public void deleteLiter()
    {
	setComponentAbsent(4);
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
	    "CITSVehicleValue"
	),
	new QName (
	    "AddGrpD",
	    "CITSVehicleValue"
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
				    new INTEGER(16383),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(16383)
			    ),
			    null
			)
		    ),
		    "rpm",
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
				    new INTEGER(20),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(20)
			    ),
			    null
			)
		    ),
		    "gears",
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
				    new INTEGER(999999),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(999999)
			    ),
			    null
			)
		    ),
		    "mileage",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
				    new INTEGER(100),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(100)
			    ),
			    null
			)
		    ),
		    "percent",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "liter",
		    4,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CITSVehicleValue object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSVehicleValue object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSVehicleValue
