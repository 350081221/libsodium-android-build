.class final Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanParcelableUsage"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0083\u0008\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002H\u00c2\u0003J\u0018\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0008\u0010\t\u001a\u00020\u0002H\u0016J\u0013\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\n\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\r\u001a\u00020\u000cH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;",
        "Landroid/os/Parcelable;",
        "",
        "component1",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "Lkotlin/r2;",
        "writeToParcel",
        "describeContents",
        "index",
        "copy",
        "",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "I",
        "<init>",
        "(I)V",
        "Companion",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field

.field public static final Companion:Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final index:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->Companion:Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$Companion;

    .line 8
    .line 9
    new-instance v0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$Companion$CREATOR$1;

    .line 10
    .line 11
    invoke-direct {v0}, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$Companion$CREATOR$1;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->index:I

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method

.method private final component1()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->index:I

    return v0
.end method

.method public static synthetic copy$default(Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;IILjava/lang/Object;)Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->index:I

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->copy(I)Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(I)Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;-><init>(I)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
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
    instance-of v1, p1, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;

    iget v1, p0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->index:I

    iget p1, p1, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->index:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DefaultLazyKey(index="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->index:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1    # Landroid/os/Parcel;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget p2, p0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->index:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
