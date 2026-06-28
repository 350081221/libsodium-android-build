.class final Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/DateInputKt;->DateInputTextField-tQNruF0(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lv3/l;Landroidx/compose/material3/CalendarModel;Lv3/p;Lv3/p;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/DateInputFormat;Ljava/util/Locale;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "input",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/ui/text/input/TextFieldValue;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputTextField$1$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,377:1\n1064#2,2:378\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputTextField$1$1\n*L\n138#1:378,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $calendarModel:Landroidx/compose/material3/CalendarModel;

.field final synthetic $dateInputFormat:Landroidx/compose/material3/DateInputFormat;

.field final synthetic $dateInputValidator:Landroidx/compose/material3/DateInputValidator;

.field final synthetic $errorText:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $inputIdentifier:I

.field final synthetic $locale:Ljava/util/Locale;

.field final synthetic $onDateSelectionChange:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $text$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/material3/DateInputFormat;Landroidx/compose/runtime/MutableState;Lv3/l;Landroidx/compose/material3/CalendarModel;Landroidx/compose/material3/DateInputValidator;ILjava/util/Locale;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/DateInputFormat;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/material3/CalendarModel;",
            "Landroidx/compose/material3/DateInputValidator;",
            "I",
            "Ljava/util/Locale;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$dateInputFormat:Landroidx/compose/material3/DateInputFormat;

    iput-object p2, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$errorText:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$onDateSelectionChange:Lv3/l;

    iput-object p4, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$calendarModel:Landroidx/compose/material3/CalendarModel;

    iput-object p5, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$dateInputValidator:Landroidx/compose/material3/DateInputValidator;

    iput p6, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$inputIdentifier:I

    iput-object p7, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$locale:Ljava/util/Locale;

    iput-object p8, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$text$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/text/input/TextFieldValue;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->invoke(Landroidx/compose/ui/text/input/TextFieldValue;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/text/input/TextFieldValue;)V
    .locals 7
    .param p1    # Landroidx/compose/ui/text/input/TextFieldValue;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    invoke-virtual {p1}, Landroidx/compose/ui/text/input/TextFieldValue;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$dateInputFormat:Landroidx/compose/material3/DateInputFormat;

    invoke-virtual {v1}, Landroidx/compose/material3/DateInputFormat;->getPatternWithoutDelimiters()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v0, v1, :cond_7

    .line 3
    invoke-virtual {p1}, Landroidx/compose/ui/text/input/TextFieldValue;->getText()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    .line 4
    :goto_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v4, 0x1

    if-ge v2, v3, :cond_1

    invoke-interface {v0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 5
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v3

    if-nez v3, :cond_0

    move v0, v1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v0, v4

    :goto_1
    if-eqz v0, :cond_7

    .line 6
    iget-object v0, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$text$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, p1}, Landroidx/compose/material3/DateInputKt;->access$DateInputTextField_tQNruF0$lambda$5(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V

    .line 7
    invoke-virtual {p1}, Landroidx/compose/ui/text/input/TextFieldValue;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/text/v;->C5(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 8
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    move v0, v4

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    const/4 v2, 0x0

    if-nez v0, :cond_6

    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v3, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$dateInputFormat:Landroidx/compose/material3/DateInputFormat;

    invoke-virtual {v3}, Landroidx/compose/material3/DateInputFormat;->getPatternWithoutDelimiters()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_3

    goto :goto_3

    .line 10
    :cond_3
    iget-object v0, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$calendarModel:Landroidx/compose/material3/CalendarModel;

    .line 11
    iget-object v3, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$dateInputFormat:Landroidx/compose/material3/DateInputFormat;

    invoke-virtual {v3}, Landroidx/compose/material3/DateInputFormat;->getPatternWithoutDelimiters()Ljava/lang/String;

    move-result-object v3

    .line 12
    invoke-virtual {v0, p1, v3}, Landroidx/compose/material3/CalendarModel;->parse(Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/CalendarDate;

    move-result-object p1

    .line 13
    iget-object v0, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$errorText:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$dateInputValidator:Landroidx/compose/material3/DateInputValidator;

    .line 14
    iget v5, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$inputIdentifier:I

    .line 15
    iget-object v6, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$locale:Ljava/util/Locale;

    .line 16
    invoke-virtual {v3, p1, v5, v6}, Landroidx/compose/material3/DateInputValidator;->validate-XivgLIo(Landroidx/compose/material3/CalendarDate;ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 17
    iget-object v0, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$onDateSelectionChange:Lv3/l;

    .line 18
    iget-object v3, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$errorText:Landroidx/compose/runtime/MutableState;

    invoke-interface {v3}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_4

    move v1, v4

    :cond_4
    if-eqz v1, :cond_5

    if-eqz p1, :cond_5

    .line 19
    invoke-virtual {p1}, Landroidx/compose/material3/CalendarDate;->getUtcTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 20
    :cond_5
    invoke-interface {v0, v2}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 21
    :cond_6
    :goto_3
    iget-object p1, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$errorText:Landroidx/compose/runtime/MutableState;

    const-string v0, ""

    invoke-interface {p1, v0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 22
    iget-object p1, p0, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;->$onDateSelectionChange:Lv3/l;

    invoke-interface {p1, v2}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_4
    return-void
.end method
