.class Landroidx/core/app/GrammaticalInflectionManagerCompat$Api34Impl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x22
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/GrammaticalInflectionManagerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Api34Impl"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static getApplicationGrammaticalGender(Landroid/content/Context;)I
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/GrammaticalInflectionManagerCompat$Api34Impl;->getGrammaticalInflectionManager(Landroid/content/Context;)Landroid/app/GrammaticalInflectionManager;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/GrammaticalInflectionManager;->getApplicationGrammaticalGender()I

    move-result p0

    return p0
.end method

.method private static getGrammaticalInflectionManager(Landroid/content/Context;)Landroid/app/GrammaticalInflectionManager;
    .locals 1

    const-class v0, Landroid/app/GrammaticalInflectionManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/GrammaticalInflectionManager;

    return-object p0
.end method

.method static setRequestedApplicationGrammaticalGender(Landroid/content/Context;I)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/core/app/GrammaticalInflectionManagerCompat$Api34Impl;->getGrammaticalInflectionManager(Landroid/content/Context;)Landroid/app/GrammaticalInflectionManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Landroid/app/GrammaticalInflectionManager;->setRequestedApplicationGrammaticalGender(I)V

    .line 6
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
.end method
