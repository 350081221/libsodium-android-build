.class public abstract Landroidx/compose/material3/CalendarModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010%\n\u0002\u0008\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008!\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u00a2\u0006\u0004\u00081\u00102J\u0016\u0010\u0006\u001a\u00020\u00052\u000c\u0008\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H&J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u0007H&J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH&J\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH&J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH&J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000eH&J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000eH&J$\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u000c\u0008\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003J$\u0010\u0019\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u000c\u0008\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003J$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H&R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010!8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%R\u0014\u0010(\u001a\u00020\t8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'R\u0014\u0010+\u001a\u00020\u000e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010*R&\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170-0,8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010/\u00a8\u00063"
    }
    d2 = {
        "Landroidx/compose/material3/CalendarModel;",
        "",
        "Ljava/util/Locale;",
        "Landroidx/compose/material3/CalendarLocale;",
        "locale",
        "Landroidx/compose/material3/DateInputFormat;",
        "getDateInputFormat",
        "",
        "timeInMillis",
        "Landroidx/compose/material3/CalendarDate;",
        "getCanonicalDate",
        "Landroidx/compose/material3/CalendarMonth;",
        "getMonth",
        "date",
        "",
        "year",
        "month",
        "getDayOfWeek",
        "from",
        "addedMonthsCount",
        "plusMonths",
        "subtractedMonthsCount",
        "minusMonths",
        "",
        "skeleton",
        "formatWithSkeleton",
        "utcTimeMillis",
        "pattern",
        "formatWithPattern",
        "parse",
        "Ljava/util/Locale;",
        "getLocale",
        "()Ljava/util/Locale;",
        "",
        "formatterCache",
        "Ljava/util/Map;",
        "getFormatterCache$material3_release",
        "()Ljava/util/Map;",
        "getToday",
        "()Landroidx/compose/material3/CalendarDate;",
        "today",
        "getFirstDayOfWeek",
        "()I",
        "firstDayOfWeek",
        "",
        "Lkotlin/u0;",
        "getWeekdayNames",
        "()Ljava/util/List;",
        "weekdayNames",
        "<init>",
        "(Ljava/util/Locale;)V",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final formatterCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final locale:Ljava/util/Locale;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/Locale;)V
    .locals 0
    .param p1    # Ljava/util/Locale;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/material3/CalendarModel;->locale:Ljava/util/Locale;

    .line 5
    .line 6
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/compose/material3/CalendarModel;->formatterCache:Ljava/util/Map;

    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic formatWithSkeleton$default(Landroidx/compose/material3/CalendarModel;Landroidx/compose/material3/CalendarDate;Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 3
    iget-object p3, p0, Landroidx/compose/material3/CalendarModel;->locale:Ljava/util/Locale;

    .line 4
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/material3/CalendarModel;->formatWithSkeleton(Landroidx/compose/material3/CalendarDate;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: formatWithSkeleton"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic formatWithSkeleton$default(Landroidx/compose/material3/CalendarModel;Landroidx/compose/material3/CalendarMonth;Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 1
    iget-object p3, p0, Landroidx/compose/material3/CalendarModel;->locale:Ljava/util/Locale;

    .line 2
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/material3/CalendarModel;->formatWithSkeleton(Landroidx/compose/material3/CalendarMonth;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: formatWithSkeleton"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic getDateInputFormat$default(Landroidx/compose/material3/CalendarModel;Ljava/util/Locale;ILjava/lang/Object;)Landroidx/compose/material3/DateInputFormat;
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Landroidx/compose/material3/CalendarModel;->locale:Ljava/util/Locale;

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/material3/CalendarModel;->getDateInputFormat(Ljava/util/Locale;)Landroidx/compose/material3/DateInputFormat;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getDateInputFormat"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract formatWithPattern(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;
    .param p3    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Ljava/util/Locale;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation
.end method

.method public final formatWithSkeleton(Landroidx/compose/material3/CalendarDate;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;
    .locals 2
    .param p1    # Landroidx/compose/material3/CalendarDate;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/util/Locale;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 2
    invoke-virtual {p1}, Landroidx/compose/material3/CalendarDate;->getUtcTimeMillis()J

    move-result-wide v0

    iget-object p1, p0, Landroidx/compose/material3/CalendarModel;->formatterCache:Ljava/util/Map;

    invoke-static {v0, v1, p2, p3, p1}, Landroidx/compose/material3/CalendarModel_androidKt;->formatWithSkeleton(JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final formatWithSkeleton(Landroidx/compose/material3/CalendarMonth;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;
    .locals 2
    .param p1    # Landroidx/compose/material3/CalendarMonth;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/util/Locale;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/compose/material3/CalendarMonth;->getStartUtcTimeMillis()J

    move-result-wide v0

    iget-object p1, p0, Landroidx/compose/material3/CalendarModel;->formatterCache:Ljava/util/Map;

    invoke-static {v0, v1, p2, p3, p1}, Landroidx/compose/material3/CalendarModel_androidKt;->formatWithSkeleton(JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public abstract getCanonicalDate(J)Landroidx/compose/material3/CalendarDate;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getDateInputFormat(Ljava/util/Locale;)Landroidx/compose/material3/DateInputFormat;
    .param p1    # Ljava/util/Locale;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getDayOfWeek(Landroidx/compose/material3/CalendarDate;)I
    .param p1    # Landroidx/compose/material3/CalendarDate;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract getFirstDayOfWeek()I
.end method

.method public final getFormatterCache$material3_release()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/CalendarModel;->formatterCache:Ljava/util/Map;

    return-object v0
.end method

.method public final getLocale()Ljava/util/Locale;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/CalendarModel;->locale:Ljava/util/Locale;

    return-object v0
.end method

.method public abstract getMonth(II)Landroidx/compose/material3/CalendarMonth;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getMonth(J)Landroidx/compose/material3/CalendarMonth;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getMonth(Landroidx/compose/material3/CalendarDate;)Landroidx/compose/material3/CalendarMonth;
    .param p1    # Landroidx/compose/material3/CalendarDate;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getToday()Landroidx/compose/material3/CalendarDate;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getWeekdayNames()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/u0<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract minusMonths(Landroidx/compose/material3/CalendarMonth;I)Landroidx/compose/material3/CalendarMonth;
    .param p1    # Landroidx/compose/material3/CalendarMonth;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract parse(Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/CalendarDate;
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract plusMonths(Landroidx/compose/material3/CalendarMonth;I)Landroidx/compose/material3/CalendarMonth;
    .param p1    # Landroidx/compose/material3/CalendarMonth;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation
.end method
