.class public final Landroidx/core/app/RemoteInput$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/RemoteInput;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private mAllowFreeFormTextInput:Z

.field private final mAllowedDataTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mChoices:[Ljava/lang/CharSequence;

.field private mEditChoicesBeforeSending:I

.field private final mExtras:Landroid/os/Bundle;

.field private mLabel:Ljava/lang/CharSequence;

.field private final mResultKey:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/core/app/RemoteInput$Builder;->mAllowedDataTypes:Ljava/util/Set;

    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/core/app/RemoteInput$Builder;->mExtras:Landroid/os/Bundle;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Landroidx/core/app/RemoteInput$Builder;->mAllowFreeFormTextInput:Z

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput v0, p0, Landroidx/core/app/RemoteInput$Builder;->mEditChoicesBeforeSending:I

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iput-object p1, p0, Landroidx/core/app/RemoteInput$Builder;->mResultKey:Ljava/lang/String;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    const-string v0, "Result key can\'t be null"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1
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
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method


# virtual methods
.method public addExtras(Landroid/os/Bundle;)Landroidx/core/app/RemoteInput$Builder;
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/core/app/RemoteInput$Builder;->mExtras:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    return-object p0
.end method

.method public build()Landroidx/core/app/RemoteInput;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v8, Landroidx/core/app/RemoteInput;

    iget-object v1, p0, Landroidx/core/app/RemoteInput$Builder;->mResultKey:Ljava/lang/String;

    iget-object v2, p0, Landroidx/core/app/RemoteInput$Builder;->mLabel:Ljava/lang/CharSequence;

    iget-object v3, p0, Landroidx/core/app/RemoteInput$Builder;->mChoices:[Ljava/lang/CharSequence;

    iget-boolean v4, p0, Landroidx/core/app/RemoteInput$Builder;->mAllowFreeFormTextInput:Z

    iget v5, p0, Landroidx/core/app/RemoteInput$Builder;->mEditChoicesBeforeSending:I

    iget-object v6, p0, Landroidx/core/app/RemoteInput$Builder;->mExtras:Landroid/os/Bundle;

    iget-object v7, p0, Landroidx/core/app/RemoteInput$Builder;->mAllowedDataTypes:Ljava/util/Set;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Landroidx/core/app/RemoteInput;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZILandroid/os/Bundle;Ljava/util/Set;)V

    return-object v8
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Landroidx/core/app/RemoteInput$Builder;->mExtras:Landroid/os/Bundle;

    return-object v0
.end method

.method public setAllowDataType(Ljava/lang/String;Z)Landroidx/core/app/RemoteInput$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Landroidx/core/app/RemoteInput$Builder;->mAllowedDataTypes:Ljava/util/Set;

    .line 4
    .line 5
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object p2, p0, Landroidx/core/app/RemoteInput$Builder;->mAllowedDataTypes:Ljava/util/Set;

    .line 10
    .line 11
    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :goto_0
    return-object p0
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
.end method

.method public setAllowFreeFormInput(Z)Landroidx/core/app/RemoteInput$Builder;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-boolean p1, p0, Landroidx/core/app/RemoteInput$Builder;->mAllowFreeFormTextInput:Z

    return-object p0
.end method

.method public setChoices([Ljava/lang/CharSequence;)Landroidx/core/app/RemoteInput$Builder;
    .locals 0
    .param p1    # [Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Landroidx/core/app/RemoteInput$Builder;->mChoices:[Ljava/lang/CharSequence;

    return-object p0
.end method

.method public setEditChoicesBeforeSending(I)Landroidx/core/app/RemoteInput$Builder;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput p1, p0, Landroidx/core/app/RemoteInput$Builder;->mEditChoicesBeforeSending:I

    return-object p0
.end method

.method public setLabel(Ljava/lang/CharSequence;)Landroidx/core/app/RemoteInput$Builder;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Landroidx/core/app/RemoteInput$Builder;->mLabel:Ljava/lang/CharSequence;

    return-object p0
.end method
