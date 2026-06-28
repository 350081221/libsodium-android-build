.class public abstract Landroidx/compose/material3/BaseDatePickerStateImpl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008!\u0018\u00002\u00020\u0001B-\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e\u00a2\u0006\u0004\u0008 \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\""
    }
    d2 = {
        "Landroidx/compose/material3/BaseDatePickerStateImpl;",
        "",
        "Lkotlin/ranges/l;",
        "yearRange",
        "Lkotlin/ranges/l;",
        "getYearRange",
        "()Lkotlin/ranges/l;",
        "Landroidx/compose/material3/SelectableDates;",
        "selectableDates",
        "Landroidx/compose/material3/SelectableDates;",
        "getSelectableDates",
        "()Landroidx/compose/material3/SelectableDates;",
        "Landroidx/compose/material3/CalendarModel;",
        "calendarModel",
        "Landroidx/compose/material3/CalendarModel;",
        "getCalendarModel",
        "()Landroidx/compose/material3/CalendarModel;",
        "Landroidx/compose/runtime/MutableState;",
        "Landroidx/compose/material3/CalendarMonth;",
        "_displayedMonth",
        "Landroidx/compose/runtime/MutableState;",
        "",
        "monthMillis",
        "getDisplayedMonthMillis",
        "()J",
        "setDisplayedMonthMillis",
        "(J)V",
        "displayedMonthMillis",
        "initialDisplayedMonthMillis",
        "Ljava/util/Locale;",
        "Landroidx/compose/material3/CalendarLocale;",
        "locale",
        "<init>",
        "(Ljava/lang/Long;Lkotlin/ranges/l;Landroidx/compose/material3/SelectableDates;Ljava/util/Locale;)V",
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private _displayedMonth:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/material3/CalendarMonth;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final calendarModel:Landroidx/compose/material3/CalendarModel;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final selectableDates:Landroidx/compose/material3/SelectableDates;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final yearRange:Lkotlin/ranges/l;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Lkotlin/ranges/l;Landroidx/compose/material3/SelectableDates;Ljava/util/Locale;)V
    .locals 2
    .param p1    # Ljava/lang/Long;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lkotlin/ranges/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/material3/SelectableDates;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Ljava/util/Locale;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroidx/compose/material3/BaseDatePickerStateImpl;->yearRange:Lkotlin/ranges/l;

    .line 5
    .line 6
    iput-object p3, p0, Landroidx/compose/material3/BaseDatePickerStateImpl;->selectableDates:Landroidx/compose/material3/SelectableDates;

    .line 7
    .line 8
    invoke-static {p4}, Landroidx/compose/material3/CalendarModel_androidKt;->createCalendarModel(Ljava/util/Locale;)Landroidx/compose/material3/CalendarModel;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    iput-object p3, p0, Landroidx/compose/material3/BaseDatePickerStateImpl;->calendarModel:Landroidx/compose/material3/CalendarModel;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-virtual {p3, v0, v1}, Landroidx/compose/material3/CalendarModel;->getMonth(J)Landroidx/compose/material3/CalendarMonth;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Landroidx/compose/material3/CalendarMonth;->getYear()I

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    invoke-virtual {p2, p3}, Lkotlin/ranges/l;->l(I)Z

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    if-eqz p3, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string p4, "The initial display month\'s year ("

    .line 41
    .line 42
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Landroidx/compose/material3/CalendarMonth;->getYear()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p1, ") is out of the years range of "

    .line 53
    .line 54
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const/16 p1, 0x2e

    .line 61
    .line 62
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p2

    .line 79
    :cond_1
    invoke-virtual {p3}, Landroidx/compose/material3/CalendarModel;->getToday()Landroidx/compose/material3/CalendarDate;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p3, p1}, Landroidx/compose/material3/CalendarModel;->getMonth(Landroidx/compose/material3/CalendarDate;)Landroidx/compose/material3/CalendarMonth;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    :goto_0
    const/4 p2, 0x2

    .line 88
    const/4 p3, 0x0

    .line 89
    invoke-static {p1, p3, p2, p3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iput-object p1, p0, Landroidx/compose/material3/BaseDatePickerStateImpl;->_displayedMonth:Landroidx/compose/runtime/MutableState;

    .line 94
    .line 95
    return-void
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method


# virtual methods
.method public final getCalendarModel()Landroidx/compose/material3/CalendarModel;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/BaseDatePickerStateImpl;->calendarModel:Landroidx/compose/material3/CalendarModel;

    return-object v0
.end method

.method public final getDisplayedMonthMillis()J
    .locals 2

    iget-object v0, p0, Landroidx/compose/material3/BaseDatePickerStateImpl;->_displayedMonth:Landroidx/compose/runtime/MutableState;

    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/material3/CalendarMonth;

    invoke-virtual {v0}, Landroidx/compose/material3/CalendarMonth;->getStartUtcTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final getSelectableDates()Landroidx/compose/material3/SelectableDates;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/BaseDatePickerStateImpl;->selectableDates:Landroidx/compose/material3/SelectableDates;

    return-object v0
.end method

.method public final getYearRange()Lkotlin/ranges/l;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/BaseDatePickerStateImpl;->yearRange:Lkotlin/ranges/l;

    return-object v0
.end method

.method public final setDisplayedMonthMillis(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/BaseDatePickerStateImpl;->calendarModel:Landroidx/compose/material3/CalendarModel;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/compose/material3/CalendarModel;->getMonth(J)Landroidx/compose/material3/CalendarMonth;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, Landroidx/compose/material3/BaseDatePickerStateImpl;->yearRange:Lkotlin/ranges/l;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/compose/material3/CalendarMonth;->getYear()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p2, v0}, Lkotlin/ranges/l;->l(I)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-object p2, p0, Landroidx/compose/material3/BaseDatePickerStateImpl;->_displayedMonth:Landroidx/compose/runtime/MutableState;

    .line 20
    .line 21
    invoke-interface {p2, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v0, "The display month\'s year ("

    .line 31
    .line 32
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/compose/material3/CalendarMonth;->getYear()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p1, ") is out of the years range of "

    .line 43
    .line 44
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Landroidx/compose/material3/BaseDatePickerStateImpl;->yearRange:Lkotlin/ranges/l;

    .line 48
    .line 49
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const/16 p1, 0x2e

    .line 53
    .line 54
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p2
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method
