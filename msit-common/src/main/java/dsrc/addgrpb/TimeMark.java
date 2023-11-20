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


package dsrc.addgrpb;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type TimeMark from ASN1 Module AddGrpB.
 * @see Sequence
 */

public class TimeMark extends Sequence {
    
    /**
     * The default constructor.
     */
    public TimeMark()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TimeMark(Year year, Month month, Day day, SummerTime summerTime, 
		    Holiday holiday, DayOfWeek dayofWeek, Hour hour, 
		    Minute minute, Second second, TenthSecond tenthSecond)
    {
	setYear(year);
	setMonth(month);
	setDay(day);
	setSummerTime(summerTime);
	setHoliday(holiday);
	setDayofWeek(dayofWeek);
	setHour(hour);
	setMinute(minute);
	setSecond(second);
	setTenthSecond(tenthSecond);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Year();
	mComponents[1] = new Month();
	mComponents[2] = new Day();
	mComponents[3] = SummerTime.notInSummerTime;
	mComponents[4] = Holiday.weekday;
	mComponents[5] = DayOfWeek.unknown;
	mComponents[6] = new Hour();
	mComponents[7] = new Minute();
	mComponents[8] = new Second();
	mComponents[9] = new TenthSecond();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[10];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Year();
	    case 1:
		return new Month();
	    case 2:
		return new Day();
	    case 3:
		return SummerTime.notInSummerTime;
	    case 4:
		return Holiday.weekday;
	    case 5:
		return DayOfWeek.unknown;
	    case 6:
		return new Hour();
	    case 7:
		return new Minute();
	    case 8:
		return new Second();
	    case 9:
		return new TenthSecond();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "year"
    public Year getYear()
    {
	return (Year)mComponents[0];
    }
    
    public void setYear(Year year)
    {
	mComponents[0] = year;
    }
    
    
    // Methods for field "month"
    public Month getMonth()
    {
	return (Month)mComponents[1];
    }
    
    public void setMonth(Month month)
    {
	mComponents[1] = month;
    }
    
    
    // Methods for field "day"
    public Day getDay()
    {
	return (Day)mComponents[2];
    }
    
    public void setDay(Day day)
    {
	mComponents[2] = day;
    }
    
    
    // Methods for field "summerTime"
    public SummerTime getSummerTime()
    {
	return (SummerTime)mComponents[3];
    }
    
    public void setSummerTime(SummerTime summerTime)
    {
	mComponents[3] = summerTime;
    }
    
    
    // Methods for field "holiday"
    public Holiday getHoliday()
    {
	return (Holiday)mComponents[4];
    }
    
    public void setHoliday(Holiday holiday)
    {
	mComponents[4] = holiday;
    }
    
    
    // Methods for field "dayofWeek"
    public DayOfWeek getDayofWeek()
    {
	return (DayOfWeek)mComponents[5];
    }
    
    public void setDayofWeek(DayOfWeek dayofWeek)
    {
	mComponents[5] = dayofWeek;
    }
    
    
    // Methods for field "hour"
    public Hour getHour()
    {
	return (Hour)mComponents[6];
    }
    
    public void setHour(Hour hour)
    {
	mComponents[6] = hour;
    }
    
    
    // Methods for field "minute"
    public Minute getMinute()
    {
	return (Minute)mComponents[7];
    }
    
    public void setMinute(Minute minute)
    {
	mComponents[7] = minute;
    }
    
    
    // Methods for field "second"
    public Second getSecond()
    {
	return (Second)mComponents[8];
    }
    
    public void setSecond(Second second)
    {
	mComponents[8] = second;
    }
    
    
    // Methods for field "tenthSecond"
    public TenthSecond getTenthSecond()
    {
	return (TenthSecond)mComponents[9];
    }
    
    public void setTenthSecond(TenthSecond tenthSecond)
    {
	mComponents[9] = tenthSecond;
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
	    "dsrc.addgrpb",
	    "TimeMark"
	),
	new QName (
	    "AddGrpB",
	    "TimeMark"
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
				"dsrc.addgrpb",
				"Year"
			    ),
			    new QName (
				"AddGrpB",
				"Year"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Year(1), 
				    new Year(65535),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(65535)
			    ),
			    null
			)
		    ),
		    "year",
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
				"dsrc.addgrpb",
				"Month"
			    ),
			    new QName (
				"AddGrpB",
				"Month"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Month(1), 
				    new Month(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "month",
		    1,
		    2,
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
				"dsrc.addgrpb",
				"Day"
			    ),
			    new QName (
				"AddGrpB",
				"Day"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Day(0), 
				    new Day(255),
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
		    "day",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.addgrpb",
				"SummerTime"
			    ),
			    new QName (
				"AddGrpB",
				"SummerTime"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"notInSummerTime",
					0
				    ),
				    new MemberListElement (
					"inSummerTime",
					1
				    )
				}
			    ),
			    0,
			    SummerTime.notInSummerTime
			)
		    ),
		    "summerTime",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.addgrpb",
				"Holiday"
			    ),
			    new QName (
				"AddGrpB",
				"Holiday"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"weekday",
					0
				    ),
				    new MemberListElement (
					"holiday",
					1
				    )
				}
			    ),
			    0,
			    Holiday.weekday
			)
		    ),
		    "holiday",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.addgrpb",
				"DayOfWeek"
			    ),
			    new QName (
				"AddGrpB",
				"DayOfWeek"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unknown",
					0
				    ),
				    new MemberListElement (
					"monday",
					1
				    ),
				    new MemberListElement (
					"tuesday",
					2
				    ),
				    new MemberListElement (
					"wednesday",
					3
				    ),
				    new MemberListElement (
					"thursday",
					4
				    ),
				    new MemberListElement (
					"friday",
					5
				    ),
				    new MemberListElement (
					"saturday",
					6
				    ),
				    new MemberListElement (
					"sunday",
					7
				    )
				}
			    ),
			    0,
			    DayOfWeek.unknown
			)
		    ),
		    "dayofWeek",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"dsrc.addgrpb",
				"Hour"
			    ),
			    new QName (
				"AddGrpB",
				"Hour"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Hour(0), 
				    new Hour(255),
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
		    "hour",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"dsrc.addgrpb",
				"Minute"
			    ),
			    new QName (
				"AddGrpB",
				"Minute"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Minute(0), 
				    new Minute(255),
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
		    "minute",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"dsrc.addgrpb",
				"Second"
			    ),
			    new QName (
				"AddGrpB",
				"Second"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Second(0), 
				    new Second(60),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(60)
			    ),
			    null
			)
		    ),
		    "second",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"dsrc.addgrpb",
				"TenthSecond"
			    ),
			    new QName (
				"AddGrpB",
				"TenthSecond"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TenthSecond(0), 
				    new TenthSecond(9),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(9)
			    ),
			    null
			)
		    ),
		    "tenthSecond",
		    9,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TimeMark object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimeMark object.
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
    
} // End class definition for TimeMark
