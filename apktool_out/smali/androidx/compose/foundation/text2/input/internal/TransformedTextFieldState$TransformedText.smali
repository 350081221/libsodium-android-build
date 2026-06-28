.class final Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "TransformedText"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;",
        "",
        "text",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "offsetMapping",
        "Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;",
        "(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)V",
        "getOffsetMapping",
        "()Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;",
        "getText",
        "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final offsetMapping:Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final text:Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->text:Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->offsetMapping:Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
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

.method public static synthetic copy$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;ILjava/lang/Object;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->text:Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->offsetMapping:Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;

    :cond_1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->copy(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->text:Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    return-object v0
.end method

.method public final component2()Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->offsetMapping:Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;

    return-object v0
.end method

.method public final copy(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;
    .locals 1
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;

    invoke-direct {v0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;-><init>(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->text:Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    iget-object v3, p1, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->text:Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->offsetMapping:Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;

    iget-object p1, p1, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->offsetMapping:Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getOffsetMapping()Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->offsetMapping:Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;

    return-object v0
.end method

.method public final getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->text:Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->text:Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->offsetMapping:Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TransformedText(text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->text:Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offsetMapping="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->offsetMapping:Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
