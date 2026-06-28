.class Lcom/umeng/analytics/pro/bs$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/pro/bs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/umeng/analytics/pro/bs$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/analytics/pro/bs$a;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    if-nez p1, :cond_1

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_1
    if-nez p2, :cond_2

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_2
    instance-of v0, p1, Ljava/util/List;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    check-cast p1, Ljava/util/List;

    .line 20
    .line 21
    check-cast p2, Ljava/util/List;

    .line 22
    .line 23
    invoke-static {p1, p2}, Lcom/umeng/analytics/pro/bs;->a(Ljava/util/List;Ljava/util/List;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_3
    instance-of v0, p1, Ljava/util/Set;

    .line 29
    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    check-cast p1, Ljava/util/Set;

    .line 33
    .line 34
    check-cast p2, Ljava/util/Set;

    .line 35
    .line 36
    invoke-static {p1, p2}, Lcom/umeng/analytics/pro/bs;->a(Ljava/util/Set;Ljava/util/Set;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :cond_4
    instance-of v0, p1, Ljava/util/Map;

    .line 42
    .line 43
    if-eqz v0, :cond_5

    .line 44
    .line 45
    check-cast p1, Ljava/util/Map;

    .line 46
    .line 47
    check-cast p2, Ljava/util/Map;

    .line 48
    .line 49
    invoke-static {p1, p2}, Lcom/umeng/analytics/pro/bs;->a(Ljava/util/Map;Ljava/util/Map;)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    return p1

    .line 54
    :cond_5
    instance-of v0, p1, [B

    .line 55
    .line 56
    if-eqz v0, :cond_6

    .line 57
    .line 58
    check-cast p1, [B

    .line 59
    .line 60
    check-cast p2, [B

    .line 61
    .line 62
    invoke-static {p1, p2}, Lcom/umeng/analytics/pro/bs;->a([B[B)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    return p1

    .line 67
    :cond_6
    check-cast p1, Ljava/lang/Comparable;

    .line 68
    .line 69
    check-cast p2, Ljava/lang/Comparable;

    .line 70
    .line 71
    invoke-static {p1, p2}, Lcom/umeng/analytics/pro/bs;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    return p1
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
.end method
