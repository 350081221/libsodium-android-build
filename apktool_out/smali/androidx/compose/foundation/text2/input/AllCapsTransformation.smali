.class final Landroidx/compose/foundation/text2/input/AllCapsTransformation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/text2/input/InputTransformation;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002H\u00c2\u0003J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0008\u0010\u000b\u001a\u00020\nH\u0016J\u0013\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003R\u0014\u0010\u000c\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/AllCapsTransformation;",
        "Landroidx/compose/foundation/text2/input/InputTransformation;",
        "Landroidx/compose/ui/text/intl/Locale;",
        "component1",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "originalValue",
        "Landroidx/compose/foundation/text2/input/TextFieldBuffer;",
        "valueWithChanges",
        "Lkotlin/r2;",
        "transformInput",
        "",
        "toString",
        "locale",
        "copy",
        "",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "Landroidx/compose/ui/text/intl/Locale;",
        "Landroidx/compose/foundation/text/KeyboardOptions;",
        "keyboardOptions",
        "Landroidx/compose/foundation/text/KeyboardOptions;",
        "getKeyboardOptions",
        "()Landroidx/compose/foundation/text/KeyboardOptions;",
        "<init>",
        "(Landroidx/compose/ui/text/intl/Locale;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nAllCapsTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCapsTransformation.kt\nandroidx/compose/foundation/text2/input/AllCapsTransformation\n+ 2 TextFieldBuffer.kt\nandroidx/compose/foundation/text2/input/TextFieldBufferKt\n*L\n1#1,64:1\n545#2,7:65\n*S KotlinDebug\n*F\n+ 1 AllCapsTransformation.kt\nandroidx/compose/foundation/text2/input/AllCapsTransformation\n*L\n51#1:65,7\n*E\n"
    }
.end annotation


# instance fields
.field private final keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final locale:Landroidx/compose/ui/text/intl/Locale;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/ui/text/intl/Locale;)V
    .locals 8
    .param p1    # Landroidx/compose/ui/text/intl/Locale;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/AllCapsTransformation;->locale:Landroidx/compose/ui/text/intl/Locale;

    .line 5
    .line 6
    new-instance p1, Landroidx/compose/foundation/text/KeyboardOptions;

    .line 7
    .line 8
    sget-object v0, Landroidx/compose/ui/text/input/KeyboardCapitalization;->Companion:Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;->getCharacters-IUNYP9k()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    const/16 v6, 0x1e

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    move-object v0, p1

    .line 22
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/text/KeyboardOptions;-><init>(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;ILkotlin/jvm/internal/w;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/AllCapsTransformation;->keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method private final component1()Landroidx/compose/ui/text/intl/Locale;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/AllCapsTransformation;->locale:Landroidx/compose/ui/text/intl/Locale;

    return-object v0
.end method

.method public static synthetic copy$default(Landroidx/compose/foundation/text2/input/AllCapsTransformation;Landroidx/compose/ui/text/intl/Locale;ILjava/lang/Object;)Landroidx/compose/foundation/text2/input/AllCapsTransformation;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Landroidx/compose/foundation/text2/input/AllCapsTransformation;->locale:Landroidx/compose/ui/text/intl/Locale;

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text2/input/AllCapsTransformation;->copy(Landroidx/compose/ui/text/intl/Locale;)Landroidx/compose/foundation/text2/input/AllCapsTransformation;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Landroidx/compose/ui/text/intl/Locale;)Landroidx/compose/foundation/text2/input/AllCapsTransformation;
    .locals 1
    .param p1    # Landroidx/compose/ui/text/intl/Locale;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/foundation/text2/input/AllCapsTransformation;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/text2/input/AllCapsTransformation;-><init>(Landroidx/compose/ui/text/intl/Locale;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/text2/input/AllCapsTransformation;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/text2/input/AllCapsTransformation;

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/AllCapsTransformation;->locale:Landroidx/compose/ui/text/intl/Locale;

    iget-object p1, p1, Landroidx/compose/foundation/text2/input/AllCapsTransformation;->locale:Landroidx/compose/ui/text/intl/Locale;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getKeyboardOptions()Landroidx/compose/foundation/text/KeyboardOptions;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/AllCapsTransformation;->keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/AllCapsTransformation;->locale:Landroidx/compose/ui/text/intl/Locale;

    invoke-virtual {v0}, Landroidx/compose/ui/text/intl/Locale;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InputTransformation.allCaps(locale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/AllCapsTransformation;->locale:Landroidx/compose/ui/text/intl/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public transformInput(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldBuffer;)V
    .locals 6
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/text2/input/TextFieldBuffer;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->getChanges()Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;->getChangeCount()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ge v0, v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p1, v0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;->getRange--jx7JFs(I)J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-interface {p1, v0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;->getOriginalRange--jx7JFs(I)J

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->asCharSequence()Ljava/lang/CharSequence;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-static {v5, v1, v2}, Landroidx/compose/ui/text/TextRangeKt;->substring-FDrldGo(Ljava/lang/CharSequence;J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v2, p0, Landroidx/compose/foundation/text2/input/AllCapsTransformation;->locale:Landroidx/compose/ui/text/intl/Locale;

    .line 42
    .line 43
    invoke-static {v1, v2}, Landroidx/compose/ui/text/StringKt;->toUpperCase(Ljava/lang/String;Landroidx/compose/ui/text/intl/Locale;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {p2, v3, v4, v1}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->replace(IILjava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method
